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

//aVeryBigSum problem
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

//diagonalDifference problem
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

//plusMinus problem
//test case
arr = [-4, 3, -9, 0, 4, 1]
/*output of function should return:
0.500000
0.333333
0.166667
*/

function plusMinus(arr) {
    let positive = 0;
    let negative = 0;
    let zero = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            positive++
        } else if (arr[i] < 0) {
            negative++
        } else {
            zero++
        }
    }

    const positiveProportion = (positive / (arr.length)).toFixed(6)
    const negativeProportion = (negative / (arr.length)).toFixed(6)
    const zeroProportion = (zero / (arr.length)).toFixed(6)

    console.log(positiveProportion);
    console.log(negativeProportion);
    console.log(zeroProportion);
}

plusMinus(arr);

//staircase problem
//test case
let n = 6;
/* should output:
     #
    ##
   ###
  ####
 #####
######
*/

function staircase(n) {
    for (let i = 1; i <= n; i++) {
        let spaces = " ".repeat(n - i)
        let stairs = "#".repeat(i)
        console.log(spaces + stairs)
    }
}

staircase(n)

//miniMaxSum problem

//test case
let miniMaxArr = [1, 2, 3, 4, 5];
//should result in: 10 14
miniMaxSum(miniMaxArr)

function miniMaxSum(arr) {
    arr.sort((a, b) => a - b)

    const minSum = arr.slice(0, 4).reduce((a, b) => a + b, 0);
    const maxSum = arr.slice(1).reduce((a, b) => a + b, 0);

    console.log(minSum + " " + maxSum);
}

//timeConversion problem

//test case
let time12Hour = "07:05:45PM";
//should result in 19:05:45

console.log(timeConversion(time12Hour));

function timeConversion(time) {
    let hour = parseInt(time.substring(0, 2));
    let minute = time.substring(3, 5);
    let second = time.substring(6, 8);
    let isAM = time12Hour.endsWith("AM");

    if (isAM) {
        if (hour == 12) {
            hour = 0;
        }
    } else {
        if (hour != 12) {
            hour += 12;
        }
    }

    hour = (hour < 10) ? `0${hour}` : hour;

    return `${hour}:${minute}:${second}`
}