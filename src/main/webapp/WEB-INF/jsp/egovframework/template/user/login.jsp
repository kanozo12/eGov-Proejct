<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
    <div class="container">
        <div class="row">
            <div class="col-10 offset-1">
                <h2>로그인</h2>
                <form method="post" action="/user/login">
                    <div class="form-group">
                        <label for="userid">이메일(아이디)</label> <input type="email" class="form-control" name="userid"
                            id="userid" placeholder="아이디로 사용할 이메일 주소">
                        <div class="invalid-feedback">사용자 아이디 오류시 보여줄 에러메시지</div>
                    </div>

                    <div class="form-group">
                        <label for="password">비밀번호</label> <input type="password" class="form-control" name="password"
                            id="password" placeholder="비밀번호를 입력하세요">
                        <div class="invalid-feedback"></div>
                    </div>

                    <button type="submit" class="btn btn-primary">로그인</button>
                </form>
            </div>
        </div>
    </div>
</body>