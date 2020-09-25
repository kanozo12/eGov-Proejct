<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="egovframework.example.domain.Criteria"%>

<%
	Criteria criteria;
%>
<body>
	<div class="container">
		<div class="category">
			<div class="cate-item">
				<i class="far fa-calendar-check"></i>
				<p class="mt-3">공지사항</p>
				<div class="line-bar mt-2 active"></div>
			</div>

			<div class="cate-item">
				<i class="fas fa-bullhorn"></i>
				<p class="mt-3">자유게시판</p>
				<div class="line-bar mt-2"></div>
			</div>
			<div class="cate-item">
				<i class="far fa-clipboard"></i>
				<p class="mt-3">QnA</p>
				<div class="line-bar mt-2"></div>
			</div>
			<div class="cate-item">
				<i class="fas fa-microphone"></i>
				<p class="mt-3">보도자료</p>
				<div class="line-bar mt-2"></div>
			</div>

		</div>

		<table>
			<thead>
				<tr>
					<th class="t-l">No</th>
					<th class="t-l">제목</th>
					<th class="t-c">첨부</th>
					<th class="t-c">작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${list}">
					<tr>
						<td>${board.id}</td>
						<td><a
							href="/board/view2/${board.id}${criteria.getQuery(criteria.page)}">${board.title}</a>
						</td>
						<td class="t-c">-</td>
						<fmt:parseDate var="dateFmt" pattern="yyyy-MM-dd"
							value="${board.writeDate}" />
						<fmt:formatDate var="dateTemParse" pattern="yyyy-MM-dd"
							value="${dateFmt}" />
						<td class="t-c">${dateTemParse}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


		<nav>
			<ul class="pagination justify-content-center align-items-center">
				<c:if test="${criteria.prev}">
					<li class="page-item"><a
						href="/board/list${criteria.getQuery(criteria.start - 1)}"
						class="page-link" aria-label="Previous"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
				</c:if>

				<c:forEach var="i" begin="${criteria.start}" end="${criteria.end}"
					step="1">
					<li class="page-item"><a
						href="/board/list${criteria.getQuery(i)}" class="page-link">${i}</a>
					</li>
				</c:forEach>

				<c:if test="${criteria.next}">
					<li class="page-item"><a
						href="/board/list${criteria.getQuery(criteria.end + 1)}"
						class="page-link" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
					</a></li>
				</c:if>
			</ul>
		</nav>
	</div>
	<script>
		$(function() {
			$("#btnSearch").on("click", function(e) {
				let text = $("#keyword").val();
				location.href = '/board/list?keyword=' + text;
			});
			$("#searchForm").on("submit", function(e) {
				$("#btnSearch").click();
				return false;
			});
		});
	</script>
</body>