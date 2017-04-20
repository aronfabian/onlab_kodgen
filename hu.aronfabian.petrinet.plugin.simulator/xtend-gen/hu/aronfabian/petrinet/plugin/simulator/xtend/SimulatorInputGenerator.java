package hu.aronfabian.petrinet.plugin.simulator.xtend;

import hu.aronfabian.petrinet.plugin.simulator.ext.NeighboursMatrix;
import java.io.ByteArrayInputStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import petrinet.Net;
import petrinet.Place;
import petrinet.Transition;

@SuppressWarnings("all")
public class SimulatorInputGenerator {
  public static void generateCode(final IPath folder, final Net net, final IProgressMonitor monitor) {
    final String project = folder.segment(0);
    IFile file = null;
    IFolder iFolder = null;
    int _segmentCount = folder.segmentCount();
    boolean _equals = (_segmentCount == 1);
    if (_equals) {
      iFolder = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFolder("/simulator");
      file = iFolder.getFile("SimulatorInput.c");
    } else {
      IProject _project = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
      IPath _removeFirstSegments = folder.removeFirstSegments(1);
      String _plus = (_removeFirstSegments + "/simulator");
      iFolder = _project.getFolder(_plus);
      file = iFolder.getFile("SimulatorInput.c");
    }
    try {
      boolean _exists = iFolder.exists();
      boolean _not = (!_exists);
      if (_not) {
        iFolder.create(IResource.NONE, true, null);
      }
      boolean _exists_1 = file.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        byte[] _bytes = SimulatorInputGenerator.generateSimulatorInput(net).getBytes();
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
        file.create(_byteArrayInputStream, true, monitor);
      } else {
        byte[] _bytes_1 = SimulatorInputGenerator.generateSimulatorInput(net).getBytes();
        ByteArrayInputStream _byteArrayInputStream_1 = new ByteArrayInputStream(_bytes_1);
        file.setContents(_byteArrayInputStream_1, true, true, monitor);
      }
    } catch (final Throwable _t) {
      if (_t instanceof CoreException) {
        final CoreException e = (CoreException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private static String generateSimulatorInput(final Net net) {
    String _xblockexpression = null;
    {
      final EList<Place> places = net.getPlace();
      final EList<Transition> transitions = net.getTransition();
      final NeighboursMatrix w = new NeighboursMatrix(net);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include \"PetrinetType.h\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("int state[] = { ");
      {
        boolean _hasElements = false;
        for(final Place place : places) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "");
          }
          _builder.append(" ");
          int _tokenNum = place.getTokenNum();
          _builder.append(_tokenNum);
        }
      }
      _builder.append(" };");
      _builder.newLineIfNotEmpty();
      _builder.append("int neigh[");
      int _size = transitions.size();
      _builder.append(_size);
      _builder.append("][");
      int _size_1 = places.size();
      _builder.append(_size_1);
      _builder.append("] = ");
      String _string = w.toString();
      _builder.append(_string);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("PetriNet petrinet = { &state, &neigh, ");
      int _size_2 = places.size();
      _builder.append(_size_2);
      _builder.append(", ");
      int _size_3 = transitions.size();
      _builder.append(_size_3);
      _builder.append(" };");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
