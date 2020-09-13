String call() {
    println currentBuild.getNumber()
    return '*/1 * * * 0-7'
}
