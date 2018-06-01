

var floatiewidth="450px" //default width of floatie in px
var floatieheight="150px" //default height of floatie in px. Set to "" to let floatie content dictate height.
var floatiebgcolor="lightyellow" //default bgcolor of floatie
var fadespeed=70 //speed of fade (5 or above). Smaller=faster.

var baseopacity=0
function slowhigh(which2)
{
	imgobj=which2
	browserdetect=which2.filters? "ie" : typeof which2.style.MozOpacity=="string"? "mozilla" : ""
	instantset(baseopacity)
	highlighting=setInterval("gradualfade(imgobj)",fadespeed)
}

function instantset(degree)
{
	cleartimer()
	if (browserdetect=="mozilla")
	imgobj.style.MozOpacity=degree/100
	else if (browserdetect=="ie")
	imgobj.filters.alpha.opacity=degree
}

function cleartimer()
{
	if (window.highlighting) clearInterval(highlighting)
}

function gradualfade(cur2)
{
	if (browserdetect=="mozilla" && cur2.style.MozOpacity<1)
	cur2.style.MozOpacity=Math.min(parseFloat(cur2.style.MozOpacity)+0.1, 0.99)
	else if (browserdetect=="ie" && cur2.filters.alpha.opacity<100)
	cur2.filters.alpha.opacity+=10
	else if (window.highlighting)
	clearInterval(highlighting)
}

function ietruebody()
{
	return (document.compatMode && document.compatMode!="BackCompat")? document.documentElement : document.body
}

function paramexists(what){
return(typeof what!="undefined" && what!="")
}

/*
function showfloatie(thetext, e, optbgColor, optWidth, optHeight)
{
	var dsocx=(window.pageXOffset)? pageXOffset: ietruebody().scrollLeft;
	var dsocy=(window.pageYOffset)? pageYOffset : ietruebody().scrollTop;
	var floatobj=document.getElementById("dhtmlfloatie")
	floatobj.style.left="-900px"
	floatobj.style.display="block"
	floatobj.style.backgroundColor=paramexists(optbgColor)? optbgColor : floatiebgcolor
	floatobj.style.width=paramexists(optWidth)? optWidth+"px" : floatiewidth
	floatobj.style.height=paramexists(optHeight)? optHeight+"px" : floatieheight!=""? floatieheight : ""
	floatobj.innerHTML=thetext
	var floatWidth=floatobj.offsetWidth>0? floatobj.offsetWidth : floatobj.style.width
	var floatHeight=floatobj.offsetHeight>0? floatobj.offsetHeight : floatobj.style.width
	var winWidth=document.all&&!window.opera? ietruebody().clientWidth : window.innerWidth-20
	var winHeight=document.all&&!window.opera? ietruebody().clientHeight : window.innerHeight
	e=window.event? window.event : e

	


	floatobj.style.left=dsocx+winWidth-floatWidth-5+"px"
	if (e.clientX>winWidth-floatWidth && e.clientY+20>winHeight-floatHeight)
	{
		floatobj.style.top=dsocy+5+"px"
	
	}
	else
	{
		floatobj.style.top=dsocy+winHeight-floatHeight-5+"px"

	}
	slowhigh(floatobj)
}
*/

//anson modify 
function showfloatie(optWidth, optHeight,optbgColor)
{
	var dsocx=(window.pageXOffset)? pageXOffset: ietruebody().scrollLeft;
	var dsocy=(window.pageYOffset)? pageYOffset : ietruebody().scrollTop;
	var floatobj=document.getElementById("dhtmlfloatie")
	floatobj.style.left="-900px"
	floatobj.style.display="block"
	floatobj.style.backgroundColor=paramexists(optbgColor)? optbgColor : floatiebgcolor
	floatobj.style.width=paramexists(optWidth)? optWidth+"px" : floatiewidth
	floatobj.style.height=paramexists(optHeight)? optHeight+"px" : floatieheight!=""? floatieheight : ""
	//floatobj.innerHTML=thetext
	
	var floatWidth=floatobj.offsetWidth>0? floatobj.offsetWidth : floatobj.style.width
	var floatHeight=floatobj.offsetHeight>0? floatobj.offsetHeight : floatobj.style.width
	var winWidth=document.all&&!window.opera? ietruebody().clientWidth : window.innerWidth-20
	var winHeight=document.all&&!window.opera? ietruebody().clientHeight : window.innerHeight
	//e=window.event? window.event : e


	floatobj.style.left=dsocx+winWidth-floatWidth-5+"px"
//	if (e.clientX>winWidth-floatWidth && e.clientY+20>winHeight-floatHeight)
//	{
//		floatobj.style.top=dsocy+5+"px"
//	
//	}
//	else
//	{
		floatobj.style.top=dsocy+winHeight-floatHeight-5+"px"

//	}
	slowhigh(floatobj)
}

function hidefloatie()
{
	var floatobj=document.getElementById("dhtmlfloatie")
	floatobj.style.display="none"
}


var win = null;
function openWindow(mypage,haveScroll,theWidth,theHight,theName)
{
	var w = paramexists(theWidth)? theWidth:600;
	var h = paramexists(theHight)? theHight:450;
	var scroll = paramexists(haveScroll)? haveScroll:'no';
	var myname = paramexists(theName)? theName:'';
	
	LeftPosition = (screen.width) ? (screen.width-w)/2 : 0;
	TopPosition = (screen.height) ? (screen.height-h)/2 : 0;
	settings =
	'height='+h+',width='+w+',top='+TopPosition+',left='+LeftPosition+',scrollbars='+scroll+',resizable'
	win = window.open(mypage,myname,settings)
}


function doViewEmpInfo()
{
	openWindow("../Emp_Info/EmpInfo.htm","no",750,500);	
}
