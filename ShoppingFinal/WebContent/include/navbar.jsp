<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Shopping Cart</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="cart.jsp">cart<span style="color:blue;font-weight:bold">${cart_list.size() }</span></a></li>
						
						<%
						if(auth != null){%>
							
							<li class="nav-item"><a class="nav-link" href="orders.jsp">order</a></li>
							<li class="nav-item"><a class="nav-link" href="log-out">logout</a></li>
						<%}else {%>
							<li class="nav-item"><a class="nav-link" href="login.jsp">login</a></li>
							
						<%}
						
						
						
						
						%>
									
					
				</ul>

			</div>
		</div>
	</nav>
