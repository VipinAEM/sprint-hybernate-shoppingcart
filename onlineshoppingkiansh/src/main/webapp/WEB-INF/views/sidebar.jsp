<h1 class="my-4">Online Shopping</h1>
 <div class="list-group">
 
   <c:forEach items="${categories}" var="category">
 	   <a href="/view/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>
 </div>