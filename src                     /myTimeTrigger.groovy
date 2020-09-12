def myTimeTrigger(int buildNumber) {
    if (buildNumber % 2 == 0) {
        return '*/1 * * * 0-7'
    }else{
        return '*/2 * * * 0-7'
    }
}
