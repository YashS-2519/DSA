function Main () {
  let arr = [4, 3, 2, 7, 8, 2, 3, 1];
  let ans = [];
  for (let index = 1; index <= arr.length; index++) {
    if (!arr.includes(index)) {
      ans.push(index);
    }
  }
  console.log(ans);
}

Main();
