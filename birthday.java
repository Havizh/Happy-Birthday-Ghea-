document.getElementById('open-message-btn').addEventListener('click', function() {
    document.getElementById('birthday-message').style.display = 'block'; // Menampilkan ucapan
    document.getElementById('birthday-audio').play(); // Memutar lagu "Whut"
    this.style.display = 'none'; // Menyembunyikan tombol "Buka Ucapan"
});

document.getElementById('close-message-btn').addEventListener('click', function() {
    document.getElementById('birthday-message').style.display = 'none'; // Menyembunyikan ucapan
    document.getElementById('open-message-btn').style.display = 'block'; // Menampilkan tombol "Buka Ucapan"
    document.getElementById('birthday-audio').pause(); // Menjeda lagu
    document.getElementById('birthday-audio').currentTime = 0; // Mengulang lagu dari awal
});