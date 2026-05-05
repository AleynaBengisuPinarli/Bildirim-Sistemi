# Bildirim Sistemi - Tasarım Örüntüleri Projesi

##  Proje Açıklaması
Bu proje, yazılım tasarım örüntülerini (Design Patterns) gerçek bir bildirim sistemi üzerinden uygulayarak öğrenmeyi amaçlamaktadır. Sistem, farklı bildirim türlerini yönetebilir ve genişletilebilir bir mimari sunar.

---

##  Amaç
- Nesne yönelimli tasarım prensiplerini uygulamak
- SOLID prensiplerini pratikte görmek
- Tasarım örüntülerini gerçek bir sistem üzerinde kullanmak
- Kodun genişletilebilir ve bakımı kolay hale getirilmesi

---

##  Kullanılan Tasarım Örüntüleri

###  1. Factory Pattern (Creational)
- Bildirim nesnelerinin oluşturulmasını merkezi hale getirir.
- if-else zincirlerini ortadan kaldırır.
- Yeni bildirim türü eklemeyi kolaylaştırır.

---

###  2. Adapter Pattern (Structural)
- Dış SMS servisinin sisteme uyumlu hale getirilmesini sağlar.
- Mevcut kodu değiştirmeden dış sistem entegrasyonu yapılır.

---

###  3. Decorator Pattern (Structural)
- Bildirimlere dinamik olarak ekstra özellik eklenmesini sağlar.
- Örnek: logging (loglama) ekleme.

---

###  4. Strategy Pattern (Behavioral)
- Bildirim gönderme yönteminin runtime’da değiştirilmesini sağlar.
- Email ve SMS gibi farklı stratejiler arasında geçiş yapılabilir.

---

###  5. Observer Pattern (Behavioral)
- Kullanıcıların bildirim sistemine abone olmasını sağlar.
- Bir olay olduğunda tüm abonelere bildirim gönderilir.

---

##  Proje Mimarisi

### Faz 1
- Factory Pattern implement edildi
- if-else problemi çözüldü

### Faz 2
- Adapter Pattern eklendi
- Decorator Pattern eklendi
- Sistem genişletildi

### Faz 3
- Strategy Pattern eklendi
- Observer Pattern eklendi
- Sistem tamamen esnek hale getirildi

---

## ▶ Çalıştırma

Projeyi çalıştırmak için:

```bash
javac *.java
java Main