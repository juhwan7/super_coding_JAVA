// 태그를 가져오는 방법

//const timeElement = document.getElementById("time");

const timeElement = document.querySelector(".time");

function 클릭시_실행될_함수() {
  timeElement.style.color = "orange";
  timeElement.innerText = "12:00";
}

function 색깔을_바꿔주는_함수() {
  if (timeElement.style.color === "orange") {
    timeElement.style.color = "blue";
  } else {
    timeElement.style.color = "orange";
  }
}

function 숫자를_바꿔주는_함수() {
  timeElement.innerText = "12:30";
}

timeElement.addEventListener("mouseover", 클릭시_실행될_함수);
//클릭시_실행될_함수 뒤에 ()을 붙이면 컴퓨터가 초기
window.addEventListener("click", 색깔을_바꿔주는_함수);
document.title = "🥊";

timeElement.addEventListener("click", 숫자를_바꿔주는_함수);
