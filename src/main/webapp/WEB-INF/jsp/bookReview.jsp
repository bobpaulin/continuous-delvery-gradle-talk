<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html lang="en">
	<head>
		<title>Review - ${bookData.volumeInfo.title }</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="${contextPath}/wro/vendor.css" rel="stylesheet" />
	</head>
	<body>
		<%@include file="/WEB-INF/jsp/navigation.jspf" %>
		<h1>Book Review For - ${bookData.volumeInfo.title }</h1>
		<div class="container-fluid">
			<div id="bookContainer">
						<div class="row-fluid">
							<div class="span12">
							<a href="${bookData.volumeInfo.previewLink }">${bookData.volumeInfo.title }</a>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span12">
								<img alt="" src="${bookData.volumeInfo.imageLinks.thumbnail }">
							</div>
						</div>
						<div class="row-fluid">
							<div class="span12">
							${bookData.volumeInfo.description }
							</div>
						</div>
			</div>
			<div id="messagesContainer">
				<div class="row-fluid">
					<div class="span12">
						<h2>Reviews</h2>
						<div class="messages">
							<c:forEach items="${messageList}" var="currentMessage">
							<div class="row-fluid">
								<div class="offset4 span8">${currentMessage.userName } says...</div>
							</div>
							<div class="row-fluid">
								<div class="span12">${currentMessage.messageText }</div>
							</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<div id="newMessageContainer">
				<form:form action="${contextPath}/main/createMessage">
					<form:textarea path="messageText"/>
					<form:hidden path="userName"/>
					<form:hidden path="bookId"/>
					<input type="submit" class="btn btn-default"></input>
				</form:form>
			</div>
		</div>
		<script src="${contextPath}/wro/vendor.js"></script>
	</body>
</html>
