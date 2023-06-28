//compareTriplets problem

//test case
let a = [5, 6, 7]
let b = [7, 6, 5]
//should result in [1,1]

function compareTriplets(a, b) {
    let aliceScore = 0
    let bobScore = 0
    let arr = [aliceScore, bobScore]

    for (let i = 0; i < a.length; i++) {
        if (a[i] > b[i]) {
            aliceScore++
        } else if (a[i] < b[i]) {
            bobScore++
        }
    }

    return arr = [aliceScore, bobScore]
}

console.log(compareTriplets(a, b));

