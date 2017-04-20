package hu.aronfabian.petrinet.plugin.graphml.xtend

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
	
	def public static String place(String placeId, int tokenNum)'''
		<node id="p«placeId»">
		  <data key="d6">
			<y:ShapeNode>
			          <y:Geometry height="77.0" width="77.82795698924733" x="312.33333333333326" y="165.0"/>
			          <y:Fill color="#FFCC00" transparent="false"/>
			          <y:BorderStyle color="#000000" raised="false" type="line" width="1.0"/>
			          <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="33.40234375" horizontalTextPosition="center" iconTextGap="4" modelName="custom" textColor="#000000" verticalTextPosition="bottom" visible="true" width="50.693359375" x="13.567298807123677" y="21.798828125">Place «placeId»
			Token: «tokenNum»<y:LabelModel>
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
	def public static String transition(String transId)'''
		<node id="t«transId»">
		  <data key="d6">
		  <y:ShapeNode>
		          <y:Geometry height="99.0" width="30.0" x="556.0" y="112.0"/>
		          <y:Fill color="#FFCC00" transparent="false"/>
		          <y:BorderStyle color="#000000" raised="false" type="line" width="1.0"/>
		          <y:NodeLabel alignment="center" autoSizePolicy="content" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="custom" rotationAngle="90.0" textColor="#000000" verticalTextPosition="bottom" visible="true" width="66.6953125" x="5.6494140625" y="16.15234375">Transition «transId»<y:LabelModel>
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
	def public static String arcPtoT(int edgeId, String sourceId, String targetId, int weight)'''
		<edge id="e«edgeId»" source="p«sourceId»" target="t«targetId»">
			<data key="d10">
				<y:PolyLineEdge>
				        <y:Path sx="0.0" sy="0.0" tx="0.0" ty="0.0"/>
				        <y:LineStyle color="#000000" type="line" width="1.0"/>
				        <y:Arrows source="none" target="standard"/>
				        «IF weight > 1»
				        	<y:EdgeLabel alignment="center" configuration="AutoFlippingLabel" distance="0.5" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="two_pos" modelPosition="head" preferredPlacement="anywhere" ratio="0.5" textColor="#000000" verticalTextPosition="bottom" visible="true" width="10.673828125" x="85.52532958984375" y="-33.80030415554549">«weight»<y:PreferredPlacementDescriptor angle="0.0" angleOffsetOnRightSide="0" angleReference="absolute" angleRotationOnRightSide="co" distance="-1.0" frozen="true" placement="anywhere" side="anywhere" sideReference="relative_to_edge_flow"/>
				        	</y:EdgeLabel>
				        «ENDIF»
				        <y:BendStyle smoothed="false"/>
				      </y:PolyLineEdge>
				 </data>
		</edge>
		
	'''
	def public static String arcTtoP(int edgeId, String sourceId, String targetId, int weight)'''
		<edge id="e«edgeId»" source="t«sourceId»" target="p«targetId»">
		  <data key="d10">
			<y:PolyLineEdge>
			     <y:Path sx="0.0" sy="0.0" tx="0.0" ty="0.0"/>
			     <y:LineStyle color="#000000" type="line" width="1.0"/>
			     <y:Arrows source="none" target="standard"/>
			     «IF weight > 1»
			     	<y:EdgeLabel alignment="center" configuration="AutoFlippingLabel" distance="0.5" fontFamily="Dialog" fontSize="12" fontStyle="plain" hasBackgroundColor="false" hasLineColor="false" height="18.701171875" horizontalTextPosition="center" iconTextGap="4" modelName="two_pos" modelPosition="head" preferredPlacement="anywhere" ratio="0.5" textColor="#000000" verticalTextPosition="bottom" visible="true" width="10.673828125" x="85.52532958984375" y="-33.80030415554549">«weight»<y:PreferredPlacementDescriptor angle="0.0" angleOffsetOnRightSide="0" angleReference="absolute" angleRotationOnRightSide="co" distance="-1.0" frozen="true" placement="anywhere" side="anywhere" sideReference="relative_to_edge_flow"/>
			     	</y:EdgeLabel>
			     «ENDIF»
			     <y:BendStyle smoothed="false"/>
			      </y:PolyLineEdge>
			 </data>
		</edge>
		
	'''
}
