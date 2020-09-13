String call(int buildNumber) {
    return ((buildNumber % 2) == 0) ? '*/1 * * * 0-7' : '*/2 * * * 0-7'
}
