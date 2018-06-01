/*
function opennewwindow(url,wdh,hgt)
	{
		aler("aaaa");
		var left, top;
		
		// Open the window in the middle of the screen
		left = (screen.availWidth - wdh) / 2;
		top = (screen.availHeight - hgt) / 2 - 10;
		
		var option = "toolbar=no,menu=no,status=no,resizable=yes,scrollbars=yes,width=" + wdh + ",height=" + hgt + ",top=" + top + ",left=" + left;
		
		window.open(url,"",option);
	}
*/

function OpenNewWindow(url,wdh,hgt)
{
	var left, top;

	// Open the window in the middle of the screen
	left = (screen.availWidth - wdh) / 2;
	top = (screen.availHeight - hgt) / 2 - 10;
	
	var option = "toolbar=no,menu=no,status=no,resizable=yes,scrollbars=yes,width=" + wdh + ",height=" + hgt + ",top=" + top + ",left=" + left;
	window.open(url,"",option);
}	