<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
    <div class="container">
        <div class="row">
            <div class="col-10 offset-1">
                <h2>회원 가입</h2>
                <form method="post" action="/user/register.do" enctype="multipart/form-data">
                    <div class="form-group">
                        <label for="userid">이메일(아이디)</label>
                        <input type="email" class="form-control" name="userid" id="userid"
                            placeholder="아이디로 사용할 이메일 주소">
                        <small id="emailHelp" class="form-text text-muted">사용자 아이디로 쓸 이메일 주소를 입력하세요.</small>
                        <div class="invalid-feedback">사용자 아이디 오류시 보여줄 에러메시지</div>
                    </div>

                    <div class="form-group">
                        <label for="username">회원이름</label>
                        <input type="text" class="form-control" name="username" id="username" placeholder="사용자의 이름">
                        <div class="invalid-feedback">회원이름 관련 에러시 보여줄 메시지</div>
                    </div>

                    <div class="form-group">
                        <label for="password">비밀번호</label>
                        <input type="password" class="form-control" name="password" id="password"
                            placeholder="비밀번호를 입력하세요">
                        <div class="invalid-feedback">비밀번호 관련 에러시 보여줄 메시지</div>
                    </div>

                    <div class="form-group">
                        <label for="password">비밀번호 확인</label>
                        <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm"
                            placeholder="비밀번호를 확인 입력하세요">
                    </div>

                    <div class="form-group">
                        <label for="profileImg">프로필 이미지 업로드</label>
                        <input type="file" class="form-control-file" name="profileImg" id="profileImg">
                        <div class="invalid-feedback">프로필 이미지 형식 불일치시 보여줄 메시지</div>
                    </div>

                    <button type="submit" class="btn btn-primary">회원가입</button>
                </form>
            </div>
        </div>
    </div>
</body>