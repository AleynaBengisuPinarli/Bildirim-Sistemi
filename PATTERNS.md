# Kullanılan Tasarım Örüntüleri

## Factory Pattern

### Neden Kullanıldı?
NotificationService sınıfından nesne oluşturma sorumluluğunu ayırmak için kullanıldı.

### Hangi Problemi Çözdü?
- if-else zincirini ortadan kaldırdı
- Açık/Kapalı Prensibi sağlandı
- Nesne oluşturma merkezi hale getirildi

### Önceki Durum
NotificationService, hangi nesnenin oluşturulacağını kendisi belirliyordu.

### Sonraki Durum
NotificationFactory sınıfı tüm nesne oluşturma işlemlerini üstlendi.

### Kazanımlar
- Kod daha esnek hale geldi
- Yeni bildirim türü eklemek kolaylaştı
- Bakımı daha kolay bir yapı oluştu