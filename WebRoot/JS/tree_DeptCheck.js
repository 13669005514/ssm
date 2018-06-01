if (document.getElementById) 
{
	

var Node674 = new WebFXTree('行政组织机构',"javaScript:nodeOnClick(674,'行政组织机构',1)",null,'../images/Dept.png', '../images/Dept.png');
Node674.setBehavior('classic');
//var Node674 = new WebFXTreeItem('本部',"javaScript:nodeOnClick( 674 ,'',-1)",null,'../images/xtree/foldericon.png','../images/xtree/openfoldericon.png')
//Node674.add(Node674);
//var Node636 = new WebFXTreeItem('三源电力投资控股有限公司',"javaScript:nodeOnClick(636,'三源电力投资控股有限公司',1)",null,'../images/Comp.png', '../images/Comp.png');
//Node674.add(Node636);
//var Node674636 = new WebFXTreeItem('本部',"javaScript:nodeOnClick( 636 ,'',-1)",null,'../images/xtree/foldericon.png','../images/xtree/openfoldericon.png')
//Node636.add(Node674636);

var Node637 = new WebFXTreeItem('工程管理处',"javaScript:nodeOnClick(637,'工程管理处',2)",null,'../images/frontpage.png', '../images/frontpage.png');
Node674.add(Node637);

var Node6376 = new WebFXTreeItem('各部门考核(季度)',"javaScript:nodeOnClick(637,'1',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/comp.png');
Node637.add(Node6376);



var Node641 = new WebFXTreeItem('各部门考核(年)',"javaScript:nodeOnClick(641,'2',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node637.add(Node641);


var Node639 = new WebFXTreeItem('中层岗位考核(季度)',"javaScript:nodeOnClick(639,'3',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/comp.png');

Node637.add(Node639);

var Node6455 = new WebFXTreeItem('中层岗位考核(年)',"javaScript:nodeOnClick(645,'4',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node637.add(Node6455);


var Node653 = new WebFXTreeItem('于桥水库',"javaScript:nodeOnClick(653,'于桥水库',1)",null,'../images/frontpage.png', '../images/frontpage.png');
Node674.add(Node653);
var Node6530 = new WebFXTreeItem('各部门考核(季度)',"javaScript:nodeOnClick(653,'1',1)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node653.add(Node6530);


var Node700 = new WebFXTreeItem('各部门考核(年)',"javaScript:nodeOnClick(639,'2',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node653.add(Node700);


var Node800 = new WebFXTreeItem('中层岗位考核(季度)',"javaScript:nodeOnClick(641,'3',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node653.add(Node800);



var Node6456 = new WebFXTreeItem('中层岗位考核(年)',"javaScript:nodeOnClick(645,'4',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node653.add(Node6456);

var Node1000 = new WebFXTreeItem('尔王庄水库',"javaScript:nodeOnClick(653,'尔王庄水库',1)",null,'../images/frontpage.png', '../images/frontpage.png');
Node674.add(Node1000);

var Node10005 = new WebFXTreeItem('各部门考核(季度)',"javaScript:nodeOnClick(653,'1',1)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/comp.png');
Node1000.add(Node10005);




var Node1002 = new WebFXTreeItem('各部门考核(年)',"javaScript:nodeOnClick(639,'2',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/comp.png');
Node1000.add(Node1002);



var Node2000 = new WebFXTreeItem('中层岗位考核(季度)',"javaScript:nodeOnClick(641,'3',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/comp.png');
Node1000.add(Node2000);

var Node8000 = new WebFXTreeItem('中层岗位考核(年)',"javaScript:nodeOnClick(641,'4',2)",null,'../images/Menu_Icon_AddDisplay.gif', '../images/Comp.png');
Node1000.add(Node8000);

document.write(Node674);

}
