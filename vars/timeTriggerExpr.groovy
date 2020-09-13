String call() {
    println "currentBuild.getNumber()=${currentBuild.getNumber()}"
    println "BRANCH_NAME=${env.BRANCH_NAME}"
    return '*/1 * * * 0-7'
}
