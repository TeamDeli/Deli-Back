
# SMWU SOLUX PROJECT Team Deli BACK
- 개발 기간: 2021.07.01 ~ 2021.08.20

# ✔ Project
--------------
![deli](https://user-images.githubusercontent.com/71828832/130247602-0686ed85-c09d-41d8-98a5-43308d49ada7.png)
선물 추천 사이트, Deli
Delivery delight 선물을 통해 기쁨을 전달하세요💌

# 🙍‍♀️Contributor
--------------
[길태연](https://github.com/KilTae)|[김기연](https://github.com/kiiiyeon)|[배소린](https://github.com/bsorinnn)|[이경민](https://github.com/kyungminlee-12)|[이주은](https://github.com/lizuAg)
---|---|---|---|---|
캘린더 일정 확인|프로필 확인|홈|상품 상세 정보 확인|친구 정보 확인
캘린더 일정 추가|친구 목록 확인|홈 필터링||
캘린더 일정 삭제|위시리스트 확인|상품 검색||
||RDS 연결||

# 📕Dependencies
--------------
```
JPA
QueryDSL
Lombok
```

# 🛠Tech Stack
--------------
```
SPRING BOOT
STS4
Maven
Tomcat
JAVA 11
MYSQL WORKBENCH
AMAZON RDS
```

# 🤙Commit Convention
```
- feat    : 기능 (새로운 기능)
- fix     : 버그 (버그 수정)
- update  : 코드 (코드 수정, 추가, 보완)
- refactor: 리팩토링
- style   : 스타일 (코드 형식, 세미콜론 추가: 비즈니스 로직에 변경 없음)
- docs    : 문서 (문서 추가, 수정, 삭제)
- test    : 테스트 (테스트 코드 추가, 수정, 삭제: 비즈니스 로직에 변경 없음)
- chore   : 그 외 변경사항 (주석 추가,삭제 등)
```

# 💻Git Workflow
- develop: 통합 브랜치(default)
  - feature: 기능 개발 브랜치
- main: 완벽하게 완성된 기능들의 통합 브랜치
- PR을 통한 코드 리뷰, 전체 팀원들에게 Approve를 받아야 Merge
- 팀원 코드와 Conflict 난 경우 협의하면서 Resolve


# API 명세서
---------------------
## 프로필 화면
### Request-Header
`"Content-Type": "application/json"`

### Request-Params
`"id": int`

user 테이블의 id

### Response-Body
```
{
	"status": 200,
	"data": {
		"username": "기연",
		"comment": "델리가 좋아요~",
		"age":24,
		"gender": 0,
		"birth": "98.03.25",
		"friends": ["기연", "소린", "경민", "주은", "태연", ... ],
		"wishlist": [ //4개
				{
					"image": "image.jpeg",
					"productname": "망고빙수",
					"info": "망고빙수맛잇겟다"
				},
				{
					"image": "image.jpeg",
					"productname": "망고빙수",
					"info": "망고빙수맛잇겟다"
				},
				{
					"image": "image.jpeg",
					"productname": "망고빙수",
					"info": "망고빙수맛잇겟다"
				},
				{
					"image": "image.jpeg",
					"productname": "망고빙수",
					"info": "망고빙수맛잇겟다"
				},
		]
	}
}
```
