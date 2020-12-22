import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

private const val sampleTest1 = """nop +0
acc +1
jmp +4
acc +3
jmp -3
acc -99
acc +1
jmp -4
acc +6"""

private const val testCase1 = """acc +22
acc +0
jmp +1
acc +49
jmp +203
jmp +545
acc +26
jmp +326
acc +34
acc +23
nop +93
jmp +346
nop +513
acc -5
jmp +413
jmp +560
acc -1
jmp +344
acc +44
acc -14
nop +570
acc +12
jmp +137
jmp +411
jmp +1
jmp +128
acc -4
acc +28
acc +42
jmp +206
jmp -7
nop +386
acc +9
jmp +280
jmp +63
acc +39
acc +13
acc +30
acc +19
jmp +25
jmp -9
acc +43
jmp +180
acc -16
acc -8
acc +17
acc +11
jmp +550
acc +29
acc +40
jmp -44
jmp -10
nop +425
acc -12
jmp +19
acc +38
acc +1
jmp -9
jmp +317
acc +46
acc -15
acc +10
acc -1
jmp +382
acc +3
acc +7
nop +126
jmp +378
acc +48
jmp -21
jmp +547
acc +28
jmp +266
acc -15
acc +11
acc +11
jmp +499
acc +5
acc +38
acc +17
acc -7
jmp +444
nop +357
acc +14
acc +8
acc +1
jmp +264
nop +37
acc +15
acc +4
jmp +372
acc -1
jmp +416
acc +42
acc +44
nop +58
jmp +494
acc +24
acc +8
jmp +158
acc +19
nop +384
jmp +43
acc +0
jmp +27
jmp +479
acc +37
jmp +332
acc -5
acc +49
jmp -87
acc -2
acc +41
jmp +50
acc -7
acc +8
acc -8
acc +3
jmp +68
jmp +1
acc -11
nop +117
jmp +403
jmp +348
jmp -33
jmp +1
acc +20
jmp +300
jmp +148
jmp +1
jmp +361
acc +1
acc +12
acc +42
jmp -111
acc +36
acc +1
acc +18
jmp -10
jmp +20
jmp +464
nop -89
nop +152
jmp +2
jmp +48
acc +17
acc +29
nop +100
nop -96
jmp +27
acc -3
acc +18
jmp +293
jmp +222
acc -19
acc +35
acc +46
acc +3
jmp +230
nop -147
acc +39
jmp +46
jmp +123
acc +23
acc -9
acc +33
acc +30
jmp +444
acc -8
nop +188
acc +24
jmp -113
jmp -156
acc -10
acc +30
jmp +24
acc +49
acc +33
nop -75
acc -14
jmp -52
acc +33
jmp -156
jmp +401
acc -9
jmp +14
acc +37
acc +4
jmp +37
acc +29
nop +57
jmp +243
acc +10
nop +382
acc +19
acc +13
jmp +216
acc +17
jmp +177
nop +405
nop +9
acc +43
jmp +30
nop +387
jmp -51
jmp +97
jmp +348
jmp +397
jmp +219
nop +148
acc +34
jmp -12
acc -16
acc +5
acc +33
jmp +29
acc +49
jmp +126
acc +19
acc -11
acc -11
jmp +333
acc +10
jmp -14
jmp +89
acc +0
acc +11
jmp -196
acc +33
jmp +1
acc +31
jmp +353
jmp +268
nop +170
jmp +218
jmp +90
acc -18
jmp -45
jmp -156
jmp -227
acc +5
acc -13
jmp -136
jmp +1
jmp -52
acc +24
jmp +104
nop -3
acc +16
acc +0
acc +50
jmp -7
acc +37
acc +7
acc -19
acc -14
jmp +171
acc +12
acc +42
acc -15
jmp +12
acc +21
acc +37
jmp -56
jmp +1
acc -3
jmp -147
nop -84
acc -14
acc +19
nop +221
jmp -132
acc +10
jmp +27
acc +0
jmp +250
acc +12
acc -9
acc +5
nop +263
jmp +30
jmp +1
acc +10
acc -17
jmp -27
acc +5
acc +40
acc -12
acc -7
jmp +99
acc +45
acc +3
acc +39
jmp -229
acc +50
acc +17
acc +31
jmp -12
nop -41
jmp +89
jmp -36
jmp +49
jmp +1
nop +214
acc +25
acc +23
jmp +211
nop +180
acc +45
jmp +245
acc -10
jmp +225
jmp -120
acc -4
acc +45
jmp +214
acc +6
acc +50
acc +26
jmp -180
nop +83
jmp +91
acc +37
acc +42
jmp -115
jmp +146
acc +31
jmp -144
acc -14
jmp -238
acc +43
acc +31
jmp -149
acc -19
jmp +157
acc -8
acc -16
jmp +274
acc +21
acc -14
jmp -135
acc +40
jmp -272
acc +33
acc -11
jmp -51
acc +35
acc +31
acc +14
jmp -267
acc +38
acc -16
acc +43
jmp -25
acc +37
nop +40
jmp +219
acc +23
nop -166
jmp +126
jmp -241
acc +37
acc +39
nop -187
acc +21
jmp -179
acc +32
jmp +72
acc +14
acc +0
acc +12
acc +22
jmp -15
nop -30
jmp -339
acc +21
jmp -160
acc +14
acc +17
acc -18
nop +210
jmp +110
acc +46
jmp -325
acc +27
acc -13
acc -4
jmp -259
acc -19
acc -11
acc +19
acc +36
jmp -357
nop -60
jmp +190
acc +34
acc -4
nop +20
jmp +1
jmp -152
acc +35
acc -18
jmp -77
nop -264
acc -2
acc +4
acc +4
jmp -224
nop -75
acc +6
acc -14
jmp -270
acc -14
jmp -365
acc +23
acc -19
jmp +61
acc -1
acc +7
acc +0
acc +11
jmp +176
acc +17
acc -5
acc +12
acc +38
jmp +45
jmp +1
acc +22
acc -11
acc +10
jmp -396
acc +36
jmp -280
acc +23
nop +56
acc -7
jmp -421
jmp -77
acc +31
nop -97
acc +29
jmp -401
nop -324
jmp -237
acc +24
acc +6
acc -9
jmp -337
acc -7
acc -3
jmp -445
acc +24
acc +11
acc +47
acc +47
jmp -359
acc -6
acc -6
jmp +1
jmp +1
jmp -34
acc -12
acc +34
acc +36
acc +3
jmp +11
acc -18
acc +26
acc +43
jmp -454
acc +6
acc +46
acc +45
acc +37
jmp -23
jmp -412
acc +31
acc +2
acc -9
acc +24
jmp -469
nop -114
acc -19
jmp -127
jmp -313
jmp -367
acc +0
jmp +34
acc +22
jmp -152
acc +18
acc +14
acc +43
jmp +56
nop -61
acc -14
acc +22
nop -71
jmp -408
nop -359
acc -15
acc +14
acc +5
jmp -266
acc -10
acc -14
jmp -95
acc +5
acc -11
acc +42
jmp -485
acc +0
acc +32
acc +14
acc +16
jmp +74
nop +5
jmp +1
jmp -32
acc +31
jmp -34
jmp -452
acc +15
jmp -7
acc -12
jmp +16
nop -515
jmp -404
nop +33
jmp -290
acc -5
acc +43
acc +6
acc +27
jmp -462
jmp +1
acc +37
acc +2
acc +17
jmp -220
jmp +43
acc +49
acc -10
acc -3
jmp +17
nop -523
nop -456
acc +8
jmp -396
jmp -182
nop +11
jmp +1
jmp -434
acc +36
acc +50
nop -486
acc +31
jmp -220
acc +15
acc -15
jmp -44
acc -17
acc +5
nop -332
acc +46
jmp -184
acc -12
acc +46
jmp -219
acc +27
acc +31
jmp -155
acc +44
jmp +30
nop -5
acc +11
acc +0
acc -11
jmp -455
acc +30
acc -3
acc -2
jmp -444
jmp +6
acc +44
acc +15
acc +21
acc -12
jmp -417
nop -229
jmp -494
acc -12
acc +16
acc +21
acc +5
jmp -34
nop -353
acc -19
acc +15
acc -16
jmp -448
acc +18
jmp -427
acc +43
nop -589
acc +26
jmp -297
acc +0
acc +15
jmp -249
acc +16
acc -7
jmp -337
nop -566
acc +35
jmp -471
acc -8
acc +18
nop -549
acc +15
jmp +1"""

class HandHeldHaltingTest : StringSpec({
    val h = HandHeldHalting()

    "sample test case 1" {
        h.run(sampleTest1) shouldBe 5
    }

    "test case 1" {
        h.run(testCase1) shouldBe 1930
    }

    "sample test case 2" {
        h.run2(sampleTest1) shouldBe 8
    }

    "test case 2" {
        h.run2(testCase1) shouldBe 1688
    }
})
