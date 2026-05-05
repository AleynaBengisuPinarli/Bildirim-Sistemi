# Problemler (Faz 0 Analizi)

## Problem 1: Açık/Kapalı Prensibi İhlali (OCP)
NotificationService sınıfı, bildirim türünü belirlemek için if-else blokları kullanıyordu.  
Bu durum Open/Closed Principle’a aykırıdır çünkü yeni bir bildirim türü eklemek için mevcut kodun değiştirilmesi gerekir.

## Problem 2: Sıkı Bağlılık (Tight Coupling)
Servis sınıfı, Email, SMS ve Push gibi somut sınıflara doğrudan bağımlıdır.

## Problem 3: Genişletilebilirlik Sorunu
Yeni bir bildirim türü eklemek için mevcut sınıfın içine müdahale edilmesi gerekir.

## Problem 4: Kod Karmaşıklığı
if-else yapıları arttıkça kod okunabilirliği ve bakım maliyeti düşer.

## Problem 5: Sorumlulukların Ayrılmaması
Nesne oluşturma (object creation) ve iş mantığı aynı sınıf içinde karışmıştır.