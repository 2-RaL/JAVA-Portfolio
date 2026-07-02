# Calculator

Bu repository Java dili ilə hazırlanmış sadə konsol kalkulyator layihəsidir. Proqram istifadəçidən 3 ədəd daxil etməyi istəyir və seçilən əməliyyata əsasən nəticəni hesablayır.

## Layihənin məqsədi

Bu layihə Java-da əsas proqramlaşdırma anlayışlarını praktiki şəkildə öyrənmək üçün hazırlanıb:

- `Scanner` ilə istifadəçidən məlumat almaq
- `double` və `int` tipli dəyişənlərlə işləmək
- `switch` operatorundan istifadə etmək
- Toplama, çıxma, vurma və bölmə əməliyyatlarını yerinə yetirmək
- Sıfıra bölmənin qarşısını almaq
- Konsol əsaslı sadə proqram yaratmaq

## Fayllar

Layihədə əsas Java faylı:

```text
Main.java
```

Əlavə olaraq IDE tərəfindən yaradılmış layihə faylı da ola bilər:

```text
Calculator-1.iml
```

`.iml` faylı IntelliJ IDEA kimi IDE-lər tərəfindən yaradılır və proqramın əsas məntiqinə aid deyil.

## Proqram necə işləyir?

Proqram istifadəçidən ardıcıl olaraq 3 ədəd alır:

```text
a
b
c
```

Sonra istifadəçiyə 4 əməliyyat seçimi təqdim olunur:

```text
No:1 +
No:2 -
No:3 *
No:4 /
```

İstifadəçi `1`, `2`, `3` və ya `4` daxil etməklə müvafiq əməliyyatı seçir.

## Əməliyyatların izahı

### 1. Toplama

Əgər istifadəçi `1` seçərsə, proqram 3 ədədi toplayır:

```text
nəticə = a + b + c
```

### 2. Çıxma

Əgər istifadəçi `2` seçərsə, proqram `a` ədədindən `b` və `c` ədədlərini çıxır:

```text
nəticə = a - b - c
```

### 3. Vurma

Əgər istifadəçi `3` seçərsə, proqram 3 ədədi bir-birinə vurur:

```text
nəticə = a * b * c
```

### 4. Bölmə

Əgər istifadəçi `4` seçərsə, proqram aşağıdakı əməliyyatı aparır:

```text
nəticə = a / b / c
```

Bu əməliyyatdan əvvəl proqram `b` və `c` ədədlərinin `0` olub-olmadığını yoxlayır. Əgər `b` və ya `c` sıfırdırsa, proqram bölməni yerinə yetirmir və belə xəbərdarlıq göstərir:

```text
Sıfıra bölmə mümkün deyil.
```

## Layihə strukturu

```text
Calculator/
├── Main.java
└── Calculator-1.iml
```

## İşə salmaq qaydası

Əvvəlcə kompüterdə Java quraşdırılmış olmalıdır.

Terminal və ya VS Code terminalında layihə qovluğuna daxil olun və aşağıdakı əmrləri yazın:

```bash
javac Main.java
java Main
```

## Nümunə istifadə

```text
a-nı daxil edin: 10
b-ni daxil edin: 5
c-ni daxil edin: 2
Əməliyyat funksiyaları: No:1 +, No:2 -, No:3 *, No:4 /
Hansı əməliyyatı seçirsiniz? (1/2/3/4): 1
Cavab: 17.0
```

## Başqa nümunə

```text
a-nı daxil edin: 20
b-ni daxil edin: 5
c-ni daxil edin: 2
Əməliyyat funksiyaları: No:1 +, No:2 -, No:3 *, No:4 /
Hansı əməliyyatı seçirsiniz? (1/2/3/4): 4
Cavab: 2.0
```

## Yanlış seçim nümunəsi

Əgər istifadəçi `1`, `2`, `3`, `4` seçimlərindən başqa dəyər daxil edərsə, proqram belə mesaj göstərir:

```text
Yanlış seçim etdiniz.
```

## Gələcəkdə əlavə edilə biləcək funksiyalar

- İki yox, istənilən sayda ədəd üzərində əməliyyat aparmaq
- Menyunun döngü ilə davam etməsi
- İstifadəçi çıxış seçənə qədər proqramın işləməsi
- Kvadrat kök, faiz, qüvvətə yüksəltmə kimi əlavə əməliyyatlar
- Yanlış məlumat daxil edildikdə daha geniş yoxlama
- Kodun ayrı-ayrı metodlara bölünməsi
- Sadə qrafik interfeys əlavə edilməsi

## Qeyd

Bu layihə başlanğıc səviyyəli Java praktikası üçün uyğundur. Proqram konsol üzərindən işləyir və istifadəçinin daxil etdiyi ədədlərə əsasən sadə riyazi hesablamalar aparır.
