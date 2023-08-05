function 가격(a) {
  if (a == "애플워치") {
    console.log(a + "는 50만원입니다.");
  } else if (a == "맥북") {
    console.log(a + "는 100만원입니다.");
  }
}

console.log("애플워치 얼마에요?");
가격("애플워치");
가격("맥북");

const 할인된_가격 = (기기이름, 가격) => {
  if (기기이름 === "맥북") {
    return 가격 * 0.8;
    //20할인
  } else if (기기이름 === "아이폰") {
    return 가격 * 0.5;
  } else {
    return 가격 * 0.5;
  }
  // 10할인
  return 가격 * 0.9;
};

console.log("할인 백북 가격 = " + 할인된_가격("맥북", 100000));
console.log("할인 아이폰 가격 = " + 할인된_가격("아이폰", 100000));
console.log("");

for (let i = 0; i < 10; i++) {
  console.log("i가 지금 " + i + "입니다");
}
