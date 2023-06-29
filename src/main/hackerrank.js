//compareTriplets problem

//test case
let a = [5, 6, 7]
let b = [7, 6, 5]
//should result in [1,1]

function compareTriplets(a, b) {
    let aliceScore = 0
    let bobScore = 0

    for (let i = 0; i < a.length; i++) {
        if (a[i] > b[i]) {
            aliceScore++
        } else if (a[i] < b[i]) {
            bobScore++
        }
    }

    return [aliceScore, bobScore]
}

console.log(compareTriplets(a, b));

//test case
let ar = [ 1000000001,
    1000000002,
    1000000003,
    1000000004,
    1000000005 ]
//output of function should be 5000000015

function aVeryBigSum(ar) {
    let sum = 0;
    for (let i = 0; i < ar.length; i++) {
        sum += ar[i]
    }

    return sum;
}

console.log(aVeryBigSum(ar));

//test case
let arr = [ [ 11, 2, 4 ],
    [ 4, 5, 6 ],
    [ 10, 8, -12 ] ]
// output of function should be 15

function diagonalDifference(arr) {
    let leftDiagonal = 0;
    let rightDiagonal = 0;

    for (let i = 0; i < arr.length; i++) {
        leftDiagonal += arr[i][i]
        rightDiagonal += arr[i][arr.length - i - 1]
    }

    return Math.abs(leftDiagonal - rightDiagonal)
}

console.log(diagonalDifference(arr));

