# Velosiped Sürət Hesablayıcı

Bu repository Java dili ilə hazırlanmış sadə konsol layihəsidir. Layihə velosiped üçün məsafə, vaxt və sürət hesablamalarını yerinə yetirir. Repository-də iki əsas Java faylı var:

- `main.java` — verilmiş məsafə və vaxta əsasən orta sürəti hesablayır.
- `velo2.java` — velosipedin dişli/sürət dəyişimini simulyasiya edir və qalan məsafəni mərhələli şəkildə hesablayır.

## Layihənin məqsədi

Bu layihənin əsas məqsədi Java-da aşağıdakı anlayışları praktiki şəkildə öyrənməkdir:

- `Scanner` ilə istifadəçidən məlumat almaq
- `if / else` şərtləri ilə yoxlama aparmaq
- `while` döngüsündən istifadə etmək
- `switch` operatoru ilə seçimləri idarə etmək
- Riyazi hesablamalar aparmaq
- Konsol əsaslı sadə proqram hazırlamaq

## Faylların izahı

### `main.java`

Bu proqram istifadəçidən iki məlumat alır:

1. Getmək istədiyi məsafə — km ilə
2. Yolda sərf etmək istədiyi vaxt — saat ilə

Daha sonra orta sürəti bu düsturla hesablayır:

```text
sürət = məsafə / vaxt
```

Əgər vaxt `0` daxil edilərsə, proqram xəta mesajı göstərir:

```text
Zaman 0 ola bilməz.
```

### `velo2.java`

Bu proqram daha geniş velosiped simulyasiyasıdır. İstifadəçi əvvəlcə ümumi məsafəni daxil edir. Sonra hər mərhələdə dişlini artırıb-azalda bilir:

```text
+  → sürəti 5 km/saat artırır
-  → sürəti 5 km/saat azaldır
```

Hər mərhələdə istifadəçidən keçən vaxt dəqiqə ilə soruşulur. Proqram həmin vaxt ərzində qət edilən məsafəni, qalan məsafəni və hazırkı sürəti hesablayır.

Proqram məsafə bitənə qədər davam edir və sonda bunları göstərir:

- Gedilən ümumi vaxt
- Ortalama sürət
- Gedəcəyiniz yerə çatdınız mesajı

## Layihə strukturu

```text
Velosiped/
├── main.java
├── velo2.java
└── Velosiped.iml
```

## İşə salmaq qaydası

Əvvəlcə kompüterdə Java quraşdırılmış olmalıdır. Terminal və ya VS Code terminalında layihə qovluğuna daxil olun.

### `main.java` faylını işə salmaq

```bash
javac main.java
java main
```

### `velo2.java` faylını işə salmaq

```bash
javac velo2.java
java velo2
```

## Nümunə istifadə

### `main.java`

```text
Velosipedinizin sürətini hesablayın!
Getmək istədiyiniz məsafə (km): 20
Yolda sərf etmək istədiyiniz zaman (saat): 2
Ortalama sürət: 10.0 km/saat
```

### `velo2.java`

```text
Toplam məsafə (km): 30
Başlanğıc dişlisi 0'dır.
Dişli artırmaq üçün +, azaltmaq üçün - daxil edin.
Dişli: +
Keçən vaxt (dəqiqə): 30
Hal-hazırdakı sürət: 5.0 km/saat
Qalan məsafə: 27.5 km
```

## Qeyd

Bu layihə başlanğıc səviyyəli Java praktikasına uyğundur. Kodlar əsasən konsol üzərindən işləyir və istifadəçidən daxil edilən məlumatlara əsasən hesablamalar aparır.

## Gələcəkdə əlavə edilə biləcək funksiyalar

- Dişli səviyyəsini ayrıca dəyişən kimi göstərmək
- Maksimum sürət limiti əlavə etmək
- Yanlış daxil edilən məlumatlar üçün daha geniş yoxlama yazmaq
- Məlumatları fayla yazmaq
- Sadə qrafik interfeys əlavə etmək
