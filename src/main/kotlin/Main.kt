import java.lang.Math.random
import kotlin.random.Random


fun main() {

// 1. buat header dulu
    createIntro()

// 2. baca dan proses yang diketik sebagai playerOption
    var playerOption = playerOption()

// 3. suruh komputer pilih sendiri sebagai computerOption
    var computerOption = computerOption()

//  4. baru deh dibandingkan angka yang diketik dan angka yang dipilih komputer
    println("Hasil game adalah ")

    if (playerOption === computerOption) {
        println("D R A W")
    }
    if (playerOption == 1 && computerOption == 2) {
        println(" The Winner is PLAYER 2")
    }
    if (playerOption == 1 && computerOption == 3) {
        println(" The Winner is PLAYER 1")
    }
    if (playerOption == 2 && computerOption == 1) {
        println(" The Winner is PLAYER 1")
    }
    if (playerOption == 2 && computerOption == 3) {
        println("The Winner is PLAYER 2")
    }
    if (playerOption == 3 && computerOption == 1) {
        println("The Winner is PLAYER 2")
    }
    if (playerOption == 3 && computerOption == 2) {
        println("The Winner is PLAYER 2")
    }

}


fun createIntro() {

//    kita panggil class BluePrintHeader
//    bikin objek header1 pake class BluePrintHeader
//    isi semua parameternya

    val header1 = BluePrintHeader(
        "========================",
        "Game Gunting Batu Kertas",
        "------------------------"
    )

//    terus kita bikin objek header2 pake class BluePrintHeader
//    tapi kita gak isi parameternya

    val header2 = BluePrintHeader()

//    baru deh kita cetak header1 tapi cuma pake parameter ke1 dan parameter ke2
//    nah buat parameter ke3 kita pake header2

    println("${header1.firstLine}")
    println("${header1.secondLine}")
    println("${header2.thirdLine}")


}

// alasan kenapa kita pake angka
// supaya kita bisa suruh komputer pilih random antara 1 hingga 3

fun computerOption(): Int {

    val numberComputer = Random.nextInt(1, 3)
    when (numberComputer) {
        1 -> println("Pilihan pemain 2 adalah GUNTING ")
        2 -> println("Pilihan pemain 2 adalah BATU  ")
        3 -> println("Pilihan pemain 2 adalah KERTAS ")
    }
    return (numberComputer)
}

fun playerOption(): Int {

//      supaya lebih mudah  pake operator AND dan OR
//      kita buat variabel untuk membandingkan angka yaitu variabel userChoice tipe data Integer
//      terus buat baca apa yang di ketik di keyboard ditampung ke variabel inputUser tipe data String
//      lalu buat membandingkan yang sudah diketik adalah gunting atau batu atau kertas
//      pake variabel userType dengan tipe Boolean

    var userChoice: Int = 1
    var inputUser: String?
    var userType: Boolean = true

//      selama yang diketik bukan gunting , batu atau kertas
//      berarti tetap minta sampe yang diketik benar
//      jika yang diketik masih salah, nilai userType tetap true
//      sampe akhirnya yang diketik benar baru nilai userType jadi false

    do {
        println("Ketikkan pilihan pemain 1 :")
        inputUser = readLine()?.trim()?.uppercase()
        when (inputUser) {
            "GUNTING" -> userType = false
            "BATU" -> userType = false
            "KERTAS" -> userType = false
        }

    } while (userType)

    //  nah jika yang diketik  sudah benar yaitu gunting, batu atau kertas
    //  baru bisa kasih nilai buat kembalikan angka yaitu nilai 1 buat gunting
    //  nilai 2 buat batu dan nilai3 buat kertas
    //  nilai angka tersebut di kembalikan sebagai variabel userChoice

    if ((inputUser == "GUNTING" || inputUser == "BATU" || inputUser == "KERTAS")) {
        when (inputUser) {
            "GUNTING" -> println("Pilihan pemain 1 adalah GUNTING ")
            "BATU" -> println("Pilihan pemain 1 adalah BATU  ")
            "KERTAS" -> println("Pilihan pemain 1 adalah KERTAS ")
        }
        when (inputUser) {
            "GUNTING" -> userChoice = 1
            "BATU" -> userChoice = 2
            "KERTAS" -> userChoice = 3
        }

    }

    return userChoice

}