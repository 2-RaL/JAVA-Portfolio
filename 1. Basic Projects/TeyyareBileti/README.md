# Təyyarə Bileti Qiymət Hesablayıcı

Bu repository Java dili ilə hazırlanmış sadə konsol layihəsidir. Layihə istifadəçidən səfər məlumatlarını alır və daxil edilən şərtlərə əsasən təyyarə biletinin endirimli qiymətini hesablayır.

## Layihənin məqsədi

Bu layihənin məqsədi Java-da əsas proqramlaşdırma anlayışlarını praktiki şəkildə tətbiq etməkdir:

- `Scanner` ilə istifadəçidən məlumat almaq
- `if / else if / else` şərtlərindən istifadə etmək
- `boolean`, `int` və `double` tipli dəyişənlərlə işləmək
- Endirim və qiymət hesablaması aparmaq
- Konsol əsaslı sadə proqram hazırlamaq

## Fayllar

Repository-də əsas fayl:

```text
TeyyareBilet.java
```

Əlavə olaraq IDE tərəfindən yaradılmış layihə faylı da ola bilər:

```text
TeyyareBileti-1.iml
```

`.iml` faylı IntelliJ IDEA kimi IDE-lər tərəfindən yaradılır və proqramın əsas məntiqinə aid deyil.

## Proqram necə işləyir?

Proqram istifadəçidən aşağıdakı məlumatları soruşur:

1. Səfər məsafəsi — kilometr ilə
2. Uşaq sayı
3. Böyük sərnişin sayı
4. Təqaüdçü olub-olmaması
5. Yaş
6. Bilet növü — gediş və ya gediş-dönüş

Daha sonra bu məlumatlara əsasən bilet qiyməti hesablanır.

## Endirim məntiqi

Proqramda endirimlər aşağıdakı qaydada tətbiq olunur:

### 1. Uşaq endirimi

Əgər məsafə 100 km-dən çoxdursa və uşaq sayı 0-dan böyükdürsə, qiymət belə hesablanır:

```text
qiymət = kilometr * 0.8
```

Bu, 20% endirim deməkdir.

### 2. Böyük sərnişin sayı üzrə endirim

Əgər böyük sərnişin sayı 2 və ya daha çoxdursa, qiymət belə hesablanır:

```text
qiymət = kilometr * 0.9
```

Bu, 10% endirim deməkdir.

### 3. Təqaüdçü və yaş endirimi

Əgər istifadəçi təqaüdçüdürsə və ya yaşı 65-dən yuxarıdırsa, qiymət belə hesablanır:

```text
qiymət = kilometr * 0.7
```

Bu, 30% endirim deməkdir.

### 4. Endirim yoxdursa

Əgər yuxarıdakı şərtlərin heç biri ödənmirsə, qiymət məsafəyə bərabər götürülür:

```text
qiymət = kilometr
```

### 5. Gediş-dönüş bileti

Əgər istifadəçi gediş-dönüş bileti seçirsə, yekun qiymət 2-yə vurulur:

```text
yekun qiymət = qiymət * 2
```

## Layihə strukturu

```text
TeyyareBileti/
├── TeyyareBilet.java
├── TeyyareBileti-1.iml
└── .gitignore
```

## İşə salmaq qaydası

Əvvəlcə kompüterdə Java quraşdırılmış olmalıdır.

Terminal və ya VS Code terminalında layihə qovluğuna daxil olun və aşağıdakı əmrləri yazın:

```bash
javac TeyyareBilet.java
java TeyyareBilet
```

## Nümunə istifadə

```text
Kilometre: 150
Çocuk sayısı: 1
Büyük sayı: 1
Emekli misiniz? (true/false): false
Yaşınız: 30
Gidiş (true) ya da gidiş-dönüş (false) bilet mi istiyorsunuz? true
Toplam indirimli fiyat: 240.0
```

Bu nümunədə məsafə 150 km-dir və uşaq sayı 1 olduğu üçün 20% endirim tətbiq olunur. Daha sonra seçilən bilet növünə görə yekun qiymət hesablanır.

## Qeyd

Hazırkı kodda istifadəçidən bilet növü üçün `true/false` daxil edilməsi tələb olunur. Daha aydın olması üçün gələcəkdə bu hissəni `1 - Gediş`, `2 - Gediş-Dönüş` formasında yazmaq daha məqsədəuyğun olar.

## Gələcəkdə əlavə edilə biləcək funksiyalar

- Bilet növünün `1` və `2` ilə seçilməsi
- Yanlış məlumat daxil edildikdə xəbərdarlıq verilməsi
- Mənfi kilometr və yaş dəyərlərinin qarşısının alınması
- Endirimlərin daha dəqiq və ayrıca göstərilməsi
- Qiymətin valyuta ilə göstərilməsi
- Kodun metodlara bölünməsi
- Sadə menyu sisteminin əlavə edilməsi
