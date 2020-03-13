# Toast
 짧게 보이는 메시지
 .show();
 Toast.makeToast(Context context, CharSequence text, int duration).show() 
 time은 크게 Toast.LENGTH_SHORT와, Toast.LENGTH_LONG라는 상수 값이 있는데 이 값은 토스트가 화면상에 어느 정도 보였다가 사라질 것인지의 시간 값을   의미 (https://frankdaily1102.tistory.com/5)
 
 ## AlertDialog
 
알림 대화상자는 AlertDialog 객체를 만들고 show 메소드를 이용해 화면에 표시
AlertDialog 객체를 만들 때는 AlertDialog.Builder 객체를 사용
알림 대화상자에는 타이틀, 안내 메시지, 아이콘 그리고 예, 아니오 버튼 등을 설정할 수 있습니다.
버튼 누르기 전에는 사라지지 않음


 ## 스낵바
 밑에 뜨는 메시지 
 화면 일부 가림
 Snackbar.make(View view, CharSequence, int duration).show()
 

