
function subNum(){
	if(document.getElementById("good_count").value!=0){
		var count=document.getElementById("good_count").value;
		count--;
		document.getElementById("good_count").value=count;
		document.getElementById("newGood_count").value=count;
	}
	}
function addNum(){
	var count=document.getElementById("good_count").value;
	count++;
	document.getElementById("good_count").value=count;
	document.getElementById("newGood_count").value=count;
	}
