<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
				<!-- Page Content  -->
				<div class="container-fluid">
					<div>
						<h1>Sign Up Page</h1>
					</div>
					<h1 class="h4 mb-4 text-gray-800">
						<div class="row justify-content-center">
							<div class="col-sm-12 col-lg-6">
								<form action="./join" method="post">
									<div class="form-group">
										<label for="name">Name</label>
										<input type="text" class="form-control" id="name" name="name">
									</div>
									<div class="form-group">
										<label for="age">age</label>
										<input type="text" class="form-control" id="age" name="age">
									</div>
									<div class="form-group">
										<label for="birth">birth</label>
										<input type="date" class="form-control" id="birth" name="birth">
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" name="num" type="checkbox" id="inlineCheckbox1" value="option1">
										<label class="form-check-label" for="inlineCheckbox1">1</label>
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" name="num" type="checkbox" id="inlineCheckbox2" value="option2">
										<label class="form-check-label" for="inlineCheckbox2">2</label>
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" name="num" type="checkbox" id="inlineCheckbox3" value="option3">
										<label class="form-check-label" for="inlineCheckbox3">3</label>
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="1">
										<label class="form-check-label" for="inlineRadio1">1</label>
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="2">
										<label class="form-check-label" for="inlineRadio2">2</label>
									</div>
									<div class="form-check form-check-inline">
										<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="3">
										<label class="form-check-label" for="inlineRadio3">3</label>
									</div>
									<div class="form-group">
										<label for="exampleFormControlSelect1">Example select</label>
										<select class="form-control" id="exampleFormControlSelect1" name="ch">
											<option value="a">1</option>
											<option value="b">2</option>
											<option value="c">3</option>
											<option>4</option>
											<option>5</option>
										</select>
									</div>
									<button type="submit" class="btn btn-primary">Submit</button>
								</form>
							</div>
						</div>
					</h1>
					<!-- End Page Content container-fluid-->
				</div>
				<!-- End Content-->
			</div>
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
			<!-- End content-wrapper -->
		</div>
		<!-- End wrapper -->
	</div>
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
</body>
</html>