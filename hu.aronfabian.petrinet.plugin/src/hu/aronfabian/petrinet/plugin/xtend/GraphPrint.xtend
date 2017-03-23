package hu.aronfabian.petrinet.plugin.xtend

class GraphPrint {
	def public static String base()'''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	<graphml xmlns="http://graphml.graphdrawing.org/xmlns" xmlns:java="http://www.yworks.com/xml/yfiles-common/1.0/java" xmlns:sys="http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0" xmlns:x="http://www.yworks.com/xml/yfiles-common/markup/2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:y="http://www.yworks.com/xml/graphml" xmlns:yed="http://www.yworks.com/xml/yed/3" xsi:schemaLocation="http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd">
	  <!--Created by yEd 3.16.2.1-->
	  <key attr.name="Description" attr.type="string" for="graph" id="d0"/>
	  <key for="port" id="d1" yfiles.type="portgraphics"/>
	  <key for="port" id="d2" yfiles.type="portgeometry"/>
	  <key for="port" id="d3" yfiles.type="portuserdata"/>
	  <key attr.name="url" attr.type="string" for="node" id="d4"/>
	  <key attr.name="description" attr.type="string" for="node" id="d5"/>
	  <key for="node" id="d6" yfiles.type="nodegraphics"/>
	  <key for="graphml" id="d7" yfiles.type="resources"/>
	  <key attr.name="url" attr.type="string" for="edge" id="d8"/>
	  <key attr.name="description" attr.type="string" for="edge" id="d9"/>
	  <key for="edge" id="d10" yfiles.type="edgegraphics"/>
	  <graph edgedefault="directed" id="G">
	'''
	
	def public static String end()'''
	</graph>
	  <data key="d7">
	    <y:Resources/>
	  </data>
	</graphml>
	
	'''
	
	def public static String place(int placeId)'''
	<node id="p�placeId�">
	  <data key="d6">
		<y:ShapeNode>
		  <y:Geometry height="30.0" width="30.0" x="20.0" y="0.0"/>
		  <y:Fill color="#FFCC00" transparent="false"/>
		  <y:BorderStyle color="#000000" raised="false" type="line" width="1.0"/>
		  <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="10.673828125" x="9.6630859375" y="5.6494140625">�placeId�<y:LabelModel>
			  <y:SmartNodeLabelModel distance="4.0"/>
			</y:LabelModel>
			<y:ModelParameter>
			  <y:SmartNodeLabelModelParameter labelRatioX="0.0" labelRatioY="0.0" nodeRatioX="0.0" nodeRatioY="0.0" offsetX="0.0" offsetY="0.0" upX="0.0" upY="-1.0"/>
			</y:ModelParameter>
		  </y:NodeLabel>
		  <y:Shape type="ellipse"/>
		</y:ShapeNode>
	  </data>
	</node>
	
	'''
	def public static String transition(int transId)'''
	<node id="t�transId�">
	  <data key="d6">
		<y:ShapeNode>
		  <y:Geometry height="61.0" width="23.0" x="23.5" y="50.0"/>
		  <y:Fill color="#FFCC00" transparent="false"/>
		  <y:BorderStyle color="#000000" raised="false" type="line" width="1.0"/>
		  <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="10.673828125" x="6.1630859375" y="21.1494140625">�transId�<y:LabelModel>
			  <y:SmartNodeLabelModel distance="4.0"/>
			</y:LabelModel>
			<y:ModelParameter>
			  <y:SmartNodeLabelModelParameter labelRatioX="0.0" labelRatioY="0.0" nodeRatioX="0.0" nodeRatioY="0.0" offsetX="0.0" offsetY="0.0" upX="0.0" upY="-1.0"/>
			</y:ModelParameter>
		  </y:NodeLabel>
		  <y:Shape type="rectangle"/>
		</y:ShapeNode>
	  </data>
	</node>
	
	'''
	def public static String arcPtoT(int edgeId, int sourceId, int targetId)'''
	<edge id="e�edgeId�" source="p�sourceId�" target="t�targetId�">
	  <data key="d10">
		<y:PolyLineEdge>
		  <y:Path sx="0.0" sy="15.0" tx="0.0" ty="-30.5"/>
		  <y:LineStyle color="#000000" type="line" width="1.0"/>
		  <y:Arrows source="none" target="standard"/>
		  <y:BendStyle smoothed="false"/>
		</y:PolyLineEdge>
	  </data>
	</edge>
	
	'''
	def public static String arcTtoP(int edgeId, int sourceId, int targetId)'''
	<edge id="e�edgeId�" source="t�sourceId�" target="p�targetId�">
	  <data key="d10">
		<y:PolyLineEdge>
		  <y:Path sx="0.0" sy="15.0" tx="0.0" ty="-30.5"/>
		  <y:LineStyle color="#000000" type="line" width="1.0"/>
		  <y:Arrows source="none" target="standard"/>
		  <y:BendStyle smoothed="false"/>
		</y:PolyLineEdge>
	  </data>
	</edge>
	
	'''
}