$(function(){
	switch(menu){
		case "About Us":
			$("#about").addClass("active");
			break;
		case "home":
			$("#home").addClass("active");
			break;
		case "Contact Us":	
			$("#contact").addClass("active");
		    break;
		case "View Products":
			$("#viewproducts").addClass("active");
		    break;
		default:
			$("#viewproducts").addClass("active");
		    $("#a_"+menu).addClass("active");
			break;
		
	}
	
})