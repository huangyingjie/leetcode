import { assert } from "chai";
describe("按对角线打印二维数组，分治思想", function () {
  const array = [
    [1, 2, 3, 4, 5],
    [1, 2, 3, 4, 5],
    [1, 2, 3, 4, 5],
    [1, 2, 3, 4, 5],
    [1, 2, 3, 4, 5]
  ];
  // 给出起始和终点元素，按斜线连接彼此
  function printDiagonalLine (array, startX, startY, endX, endY) {
    let i = startX;
    let j = startY;
    const rs = [];
    while(i <= endX && j <= endY) {
      rs.push(array[i][j]);
      i++;
      j++;
    }
    return rs.join(',');
  }
  // 把二位数组分解为逐步缩小的小二位数组，再打印其对角线
  function printFromTopRight(array) {
    const rs = [];
    for (let i = 0; i < array.length; i++) {
      rs.push(printDiagonalLine(array, 0, array.length - i - 1, i, array[0].length -1));
    }
    return rs;
  }
  function printBottomLeft(array) {
    const rs = [];
    for (let i = 1; i < array.length; i++) {
      rs.push(printDiagonalLine(array, i, 0, array.length - 1, array.length - i - 1));
    }
    return rs;
  }
  it("按斜线打印上半部分", function () {
    const topRight = printFromTopRight(array);
    assert.equal('5', topRight[0]);
    assert.equal('4,5', topRight[1]);
    assert.equal('1,2,3,4,5', topRight[4]);
  });
  it("按斜线打印下半部分", function () {
    const bottomLeft = printBottomLeft(array);
    assert.equal('1,2,3,4', bottomLeft[0]);
    assert.equal('1,2,3', bottomLeft[1]);
    assert.equal('1,2', bottomLeft[2]);
    assert.equal('1', bottomLeft[3]);
  });
});
