# Öğrenci Bilgi Sistemi

Öğrenci Not Sistemi
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

 [patika](https://app.patika.dev/fatihclsknn) 



## Installation

Öncelikle projenizi clonelayın.

```
git clone https://github.com/fatihclsknn/Java101.git
```
## Usage

Projeyi cloneladıktan sonra Visual Studio Code programında açınız.

Linux için:

```
cd Java101
code .
```

## Contributing

Pull requestler kabul edilir. Büyük değişikler için, lütfen önce neyi değiştirmek istediğinizi tartışmak için bir konu açınız.

## License
[MIT](https://choosealicense.com/licenses/mit/)