const 시작_시간 = new Date();

function setTime() {
  const 현재_시간 = new Date();
  const 흐른_시간 = new Date(현재_시간 - 시작_시간);
  const 분 = 흐른_시간.getUTCMinutes().toString().padStart("2", 0);
  const 초 = 흐른_시간.getSeconds().toString().padStart("2", 0);
  const 밀리 = 흐른_시간.getMilliseconds().toString().padStart("3", 0);
  const timeH1 = document.querySelector(".tiem");

  timeH1.innerText = `${분} : ${초}: ${밀리}`;
}

setInterval(setTime, 0);
