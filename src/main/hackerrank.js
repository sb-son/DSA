//compareTriplets

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