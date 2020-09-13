String call() {
    println "currentBuild.getNumber()=${currentBuild.getNumber()}"
    println "BRANCH_NAME=${env.BRANCH_NAME}"
   
    if( env.BRANCH_NAME =~ /master/)
        return '*/1 * * * 0-7'
    else
        return ''
}
