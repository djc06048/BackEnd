# 요리 검색 플랫폼
## 소개
냉장고에 보유한 식재료들로 매번 유튜브에 영상을 검색해서 요리를 찾는것이 불편해 사용자가 자신이 보유한 식재료로 만들 수 있는 요리와 이와 비슷한 요리를 알려주는 프로젝트를 기획

## 팀 구성
프론트엔드 1명, 백엔드 1명으로 이루어져 개발했습니다

## 기능
### 1. 회원가입, 로그인
<img width="1393" alt="image" src="https://github.com/djc06048/backend/assets/62535887/f36ee763-15c5-4985-a15d-1add45e08516">

### 2. 식재료 확인
<img width="933" alt="image" src="https://github.com/djc06048/backend/assets/62535887/6462e5f8-886d-4df3-8bd3-adc7f9a794b9">

식재료를 등록하고, 보유한 식재료로 만들 수 있는 요리를 보여줍니다.


### 3. 영양소 확인
<img width="1349" alt="image" src="https://github.com/djc06048/backend/assets/62535887/4aae8635-b5bc-4f7d-ad00-502de608c398">

사용자가 설정한 영양소에 맞는 요리를 보여줍니다.

### 4. 유사한 요리 확인
<img width="1375" alt="image" src="https://github.com/djc06048/backend/assets/62535887/6b776517-681a-4c3a-ad0a-381965bb67b6">

사용자가 설정한 선호요리와 유사한 요리를 보여줍니다.

## 맡은 역할
1. 회원가입, 로그인 기능 구현
2. 식재료 등록, 이미지는 s3 에 저장
3. 식재료 등록 시 이것으로 만들 수 있는 요리들을 외부 API 이용해 정보 가져옴
4. 사용자가 원하는 영양정보를 등록해 해당 영양정보의 기준으로 만들 수 있는 요리들을 가져옴
5. 식재료 등록시 Google cloud vision API 이용해 해당 식재료에 대한 객체 탐지 후보군들을 반환

## 아키택쳐
<img width="430" alt="image" src="https://github.com/djc06048/backend/assets/62535887/4f10d6b8-f12a-4612-b4f7-06f747f620d2">
