package basic.classtype

import java.io.File

// 1.1 이후부터 sealed 클래스 바깥에 클래스를 정의할 수 있게 됨.
// 이전에는 sealed 클래스 내부에만 정의해야했음.
// 동일 패키지 내에서만 가능하며, 다른 패키지에서는 상속을 받지 못함.
sealed interface MyError

sealed class IOError : MyError {
    class FileWriterError(val f: File) : IOError() // 1.0때는 내부에만 정의해야지 가능했음.
}

class FileReadError(val f: File) : IOError() // 1.1 이후부터는 바깥에 정의 가능함.

object MyObjectClassError : MyError // object 클래스에도 사용 가능.
