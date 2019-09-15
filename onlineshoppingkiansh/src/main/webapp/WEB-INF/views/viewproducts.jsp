<div class="container">
	<div class="row">
		<div class="col-md-3">
			<%@include file="sidebar.jsp" %>
		</div>
		
		<div class="col-md-9">	
			<div class="row">
				<c:if test="${allproductsclicked == true}">
					<div class="col-md-12">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="/home">Home</a></li>
							<li class="breadcrumb-item active">  All Products</li>
						</ol>
					</div>
				</c:if>
				
				<c:if test="${categoryproductsclicked == true}">
					<div class="col-md-12">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</div>
				</c:if>
				
				
			</div>
			
		</div>
	</div>
	
</div>