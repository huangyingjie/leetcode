
import { assert } from "chai";
describe("遍历", function () {
  const array = [1, 2, 3, 4, 5];
  it("正序遍历", function () {
    let i = 0;
    const temp = [];
    while (i < array.length) {
      temp.push(array[i++]);
    }
    assert.equal(3, temp[2]);
  });
  it("逆序遍历", function () {
    let i = array.length - 1;
    const temp = [];
    while (i >= 0) {
      temp.push(array[i--]);
    }
    assert.equal(4, temp[1]);
  });
  it("双指针遍历", function () {
    let i = array.length - 1;
    let j = 0;
    const temp = [];
    while (i > j) {
      temp.push(array[i--]);
      temp.push(array[j++]);
    }
    if (i === j) {
      temp.push(array[i]);
    }
    assert.equal(4, temp[2]);
    assert.equal(3, temp[4]);
  });
  it("循环遍历", function () {
    let i = 2;
    const temp = [];
    while (i < array.length) {
      temp.push(array[i++]);
    }
    i = 0;
    while (i < 2) {
      temp.push(array[i++]);
    }
    assert.equal(2, temp[4]);
  });
});
