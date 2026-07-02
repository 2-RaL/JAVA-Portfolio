# Bankomat

Bu repository Java dili ilə hazırlanmış sadə konsol əsaslı bankomat layihəsidir. Proqram istifadəçidən şifrə tələb edir və şifrə düzgün olduqda menyu vasitəsilə balansı göstərmək, hesaba pul daxil etmək və hesabdan pul çıxarmaq əməliyyatlarını icra edir.

## Layihənin məqsədi

Bu layihə Java-da əsas proqramlaşdırma anlayışlarını praktiki şəkildə öyrənmək üçün hazırlanıb:

- `Scanner` ilə istifadəçidən məlumat almaq
- Şifrə yoxlaması aparmaq
- `String[]` massivindən istifadə etmək
- `for` döngüsü ilə massiv elementlərini yoxlamaq
- `while` döngüsü ilə menyunu davam etdirmək
- `switch-case` ilə menyu seçimlərini idarə etmək
- Balans üzərində sadə bank əməliyyatları aparmaq
- Konsol əsaslı proqram yaratmaq

## Fayllar

Layihədə əsas Java faylı:

```text
Bankomat.java
```

Əlavə olaraq IDE tərəfindən yaradılmış layihə faylı da ola bilər:

```text
Bankomat.iml
```

`.iml` faylı IntelliJ IDEA kimi IDE-lər tərəfindən yaradılır və proqramın əsas məntiqinə aid deyil.

## Proqram necə işləyir?

Proqram əvvəlcə istifadəçidən şəxsi şifrə daxil etməyi istəyir.

Düzgün qəbul edilən şifrələr kodda massiv şəklində saxlanılıb:

```text
1234
963852
dada321
12345678
```

Əgər istifadəçi bu şifrələrdən birini düzgün daxil edərsə, bankomat menyusu açılır. Əgər şifrə səhv olarsa, proqram xəbərdarlıq mesajı göstərir və əməliyyat dayandırılır.

## Menyu seçimləri

Şifrə düzgün daxil edildikdən sonra istifadəçiyə aşağıdakı menyu təqdim olunur:

```text
1-) Pul daxil et
2-) Balans göstər
3-) Pul çıxart
4-) Çıxış et
```

## Əməliyyatların izahı

### 1. Pul daxil et

İstifadəçi `1` seçdikdə hesaba pul əlavə edə bilir. Daxil edilən məbləğ mövcud balansa əlavə olunur.

```text
balans = balans + daxil edilən məbləğ
```

Əməliyyatdan sonra yeni balans ekranda göstərilir.

### 2. Balans göstər

İstifadəçi `2` seçdikdə proqram cari balansı göstərir.

Başlanğıc balans kodda belə təyin olunub:

```text
648.90 AZN
```

### 3. Pul çıxart

İstifadəçi `3` seçdikdə proqram çıxarılacaq məbləği soruşur.

Əgər daxil edilən məbləğ balansdan az və ya bərabərdirsə, məbləğ balansdan çıxılır:

```text
balans = balans - çıxarılan məbləğ
```

Əgər çıxarılacaq məbləğ balansdan çoxdursa, proqram belə xəbərdarlıq göstərir:

```text
Balansda kifayət qədər vəsait yoxdur.
```

### 4. Çıxış et

İstifadəçi `4` seçdikdə proqramdan çıxış edilir və menyu döngüsü dayandırılır.

## Layihə strukturu

```text
Bankomat/
├── Bankomat.java
├── Bankomat.iml
└── .gitignore
```

## İşə salmaq qaydası

Əvvəlcə kompüterdə Java quraşdırılmış olmalıdır.

Terminal və ya VS Code terminalında layihə qovluğuna daxil olun və aşağıdakı əmrləri yazın:

```bash
javac Bankomat.java
java Bankomat
```

## Nümunə istifadə

```text
Şəxsi PW şifrənizi daxil edin:
1234

Menyu:
1-) Pul daxil et
2-) Balans göstər
3-) Pul çıxart
4-) Çıxış et
2
Balans:648.9AZN
```

## Pul daxil etmə nümunəsi

```text
1
Pul daxil etmək üçün əskinasları bankomatın müvafiq yerinə daxil edin.
100
Əməliyyatınız icra olunmuşdur!
Balans:748.9AZN
```

## Pul çıxarma nümunəsi

```text
3
Çıxarılacaq məbləği daxil edin:
50
Əməliyyatınız icra olunmuşdur!
Balans:598.9AZN
```

## Qeyd

Hazırkı kod başlanğıc səviyyəli Java praktikası üçün uyğundur. Proqram real bank sistemi deyil, sadəcə şifrə yoxlaması və sadə balans əməliyyatlarını öyrənmək üçün hazırlanmış konsol tətbiqidir.

Kodda menyu başlığında `"/nMenyu:"` yazılıb. Yeni sətrə keçid üçün daha düzgün yazılış belə olmalıdır:

```java
System.out.println("\nMenyu:");
```

## Gələcəkdə əlavə edilə biləcək funksiyalar

- Şifrəni 3 dəfə səhv daxil etdikdə hesabı bloklamaq
- İstifadəçi adı və kart nömrəsi əlavə etmək
- Hər istifadəçi üçün ayrıca balans saxlamaq
- Pul çıxarma zamanı mənfi məbləğin qarşısını almaq
- Pul daxil etmə zamanı yalnız müsbət məbləğ qəbul etmək
- Əməliyyat tarixçəsi yaratmaq
- Menyunu metodlara bölmək
- Kod strukturunu daha səliqəli etmək
- Sadə qrafik interfeys əlavə etmək
