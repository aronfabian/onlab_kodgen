package hu.aronfabian.petrinet.plugin.graphml.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GraphPrint {
  public static String base() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:java=\"http://www.yworks.com/xml/yfiles-common/1.0/java\" xmlns:sys=\"http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0\" xmlns:x=\"http://www.yworks.com/xml/yfiles-common/markup/2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:y=\"http://www.yworks.com/xml/graphml\" xmlns:yed=\"http://www.yworks.com/xml/yed/3\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<!--Created by yEd 3.16.2.1-->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key attr.name=\"Description\" attr.type=\"string\" for=\"graph\" id=\"d0\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key for=\"port\" id=\"d1\" yfiles.type=\"portgraphics\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key for=\"port\" id=\"d2\" yfiles.type=\"portgeometry\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key for=\"port\" id=\"d3\" yfiles.type=\"portuserdata\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key attr.name=\"url\" attr.type=\"string\" for=\"node\" id=\"d4\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key attr.name=\"description\" attr.type=\"string\" for=\"node\" id=\"d5\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key for=\"node\" id=\"d6\" yfiles.type=\"nodegraphics\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key for=\"graphml\" id=\"d7\" yfiles.type=\"resources\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key attr.name=\"url\" attr.type=\"string\" for=\"edge\" id=\"d8\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key attr.name=\"description\" attr.type=\"string\" for=\"edge\" id=\"d9\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<key for=\"edge\" id=\"d10\" yfiles.type=\"edgegraphics\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<graph edgedefault=\"directed\" id=\"G\">");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String end() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</graph>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<data key=\"d7\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<y:Resources/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</data>");
    _builder.newLine();
    _builder.append("</graphml>");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String place(final String placeId, final int tokenNum) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<node id=\"p");
    _builder.append(placeId);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<data key=\"d6\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<y:ShapeNode>");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("<y:Geometry height=\"77.0\" width=\"77.82795698924733\" x=\"312.33333333333326\" y=\"165.0\"/>");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("<y:Fill color=\"#FFCC00\" transparent=\"false\"/>");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("<y:BorderStyle color=\"#000000\" raised=\"false\" type=\"line\" width=\"1.0\"/>");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("<y:NodeLabel alignment=\"center\" autoSizePolicy=\"content\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" height=\"33.40234375\" horizontalTextPosition=\"center\" iconTextGap=\"4\" modelName=\"custom\" textColor=\"#000000\" verticalTextPosition=\"bottom\" visible=\"true\" width=\"50.693359375\" x=\"13.567298807123677\" y=\"21.798828125\">Place ");
    _builder.append(placeId, "\t          ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Token: ");
    _builder.append(tokenNum, "\t");
    _builder.append("<y:LabelModel>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t              ");
    _builder.append("<y:SmartNodeLabelModel distance=\"4.0\"/>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("</y:LabelModel>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<y:ModelParameter>");
    _builder.newLine();
    _builder.append("\t              ");
    _builder.append("<y:SmartNodeLabelModelParameter labelRatioX=\"0.0\" labelRatioY=\"0.0\" nodeRatioX=\"0.0\" nodeRatioY=\"0.0\" offsetX=\"0.0\" offsetY=\"0.0\" upX=\"0.0\" upY=\"-1.0\"/>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("</y:ModelParameter>");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("</y:NodeLabel>");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("<y:Shape type=\"ellipse\"/>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</y:ShapeNode>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("</data>");
    _builder.newLine();
    _builder.append("</node>");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String transition(final String transId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<node id=\"t");
    _builder.append(transId);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<data key=\"d6\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<y:ShapeNode>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<y:Geometry height=\"99.0\" width=\"30.0\" x=\"556.0\" y=\"112.0\"/>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<y:Fill color=\"#FFCC00\" transparent=\"false\"/>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<y:BorderStyle color=\"#000000\" raised=\"false\" type=\"line\" width=\"1.0\"/>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<y:NodeLabel alignment=\"center\" autoSizePolicy=\"content\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" height=\"18.701171875\" horizontalTextPosition=\"center\" iconTextGap=\"4\" modelName=\"custom\" rotationAngle=\"90.0\" textColor=\"#000000\" verticalTextPosition=\"bottom\" visible=\"true\" width=\"66.6953125\" x=\"5.6494140625\" y=\"16.15234375\">Transition ");
    _builder.append(transId, "          ");
    _builder.append("<y:LabelModel>");
    _builder.newLineIfNotEmpty();
    _builder.append("              ");
    _builder.append("<y:SmartNodeLabelModel distance=\"4.0\"/>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</y:LabelModel>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<y:ModelParameter>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<y:SmartNodeLabelModelParameter labelRatioX=\"0.0\" labelRatioY=\"0.0\" nodeRatioX=\"0.0\" nodeRatioY=\"0.0\" offsetX=\"0.0\" offsetY=\"0.0\" upX=\"0.0\" upY=\"-1.0\"/>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</y:ModelParameter>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</y:NodeLabel>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<y:Shape type=\"rectangle\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</y:ShapeNode>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</data>");
    _builder.newLine();
    _builder.append("</node>");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String arcPtoT(final int edgeId, final String sourceId, final String targetId, final int weight) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<edge id=\"e");
    _builder.append(edgeId);
    _builder.append("\" source=\"p");
    _builder.append(sourceId);
    _builder.append("\" target=\"t");
    _builder.append(targetId);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<data key=\"d10\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<y:PolyLineEdge>");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("<y:Path sx=\"0.0\" sy=\"0.0\" tx=\"0.0\" ty=\"0.0\"/>");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("<y:LineStyle color=\"#000000\" type=\"line\" width=\"1.0\"/>");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("<y:Arrows source=\"none\" target=\"standard\"/>");
    _builder.newLine();
    {
      if ((weight > 1)) {
        _builder.append("\t\t        ");
        _builder.append("<y:EdgeLabel alignment=\"center\" configuration=\"AutoFlippingLabel\" distance=\"0.5\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" height=\"18.701171875\" horizontalTextPosition=\"center\" iconTextGap=\"4\" modelName=\"two_pos\" modelPosition=\"head\" preferredPlacement=\"anywhere\" ratio=\"0.5\" textColor=\"#000000\" verticalTextPosition=\"bottom\" visible=\"true\" width=\"10.673828125\" x=\"85.52532958984375\" y=\"-33.80030415554549\">");
        _builder.append(weight, "\t\t        ");
        _builder.append("<y:PreferredPlacementDescriptor angle=\"0.0\" angleOffsetOnRightSide=\"0\" angleReference=\"absolute\" angleRotationOnRightSide=\"co\" distance=\"-1.0\" frozen=\"true\" placement=\"anywhere\" side=\"anywhere\" sideReference=\"relative_to_edge_flow\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t        ");
        _builder.append("</y:EdgeLabel>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t        ");
    _builder.append("<y:BendStyle smoothed=\"false\"/>");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("</y:PolyLineEdge>");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("</data>");
    _builder.newLine();
    _builder.append("</edge>");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String arcTtoP(final int edgeId, final String sourceId, final String targetId, final int weight) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<edge id=\"e");
    _builder.append(edgeId);
    _builder.append("\" source=\"t");
    _builder.append(sourceId);
    _builder.append("\" target=\"p");
    _builder.append(targetId);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<data key=\"d10\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<y:PolyLineEdge>");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("<y:Path sx=\"0.0\" sy=\"0.0\" tx=\"0.0\" ty=\"0.0\"/>");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("<y:LineStyle color=\"#000000\" type=\"line\" width=\"1.0\"/>");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("<y:Arrows source=\"none\" target=\"standard\"/>");
    _builder.newLine();
    {
      if ((weight > 1)) {
        _builder.append("\t     ");
        _builder.append("<y:EdgeLabel alignment=\"center\" configuration=\"AutoFlippingLabel\" distance=\"0.5\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" height=\"18.701171875\" horizontalTextPosition=\"center\" iconTextGap=\"4\" modelName=\"two_pos\" modelPosition=\"head\" preferredPlacement=\"anywhere\" ratio=\"0.5\" textColor=\"#000000\" verticalTextPosition=\"bottom\" visible=\"true\" width=\"10.673828125\" x=\"85.52532958984375\" y=\"-33.80030415554549\">");
        _builder.append(weight, "\t     ");
        _builder.append("<y:PreferredPlacementDescriptor angle=\"0.0\" angleOffsetOnRightSide=\"0\" angleReference=\"absolute\" angleRotationOnRightSide=\"co\" distance=\"-1.0\" frozen=\"true\" placement=\"anywhere\" side=\"anywhere\" sideReference=\"relative_to_edge_flow\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t     ");
        _builder.append("</y:EdgeLabel>");
        _builder.newLine();
      }
    }
    _builder.append("\t     ");
    _builder.append("<y:BendStyle smoothed=\"false\"/>");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("</y:PolyLineEdge>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("</data>");
    _builder.newLine();
    _builder.append("</edge>");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
