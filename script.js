document.getElementById('open-message-btn').addEventListener('click', function() {
    document.getElementById('birthday-message').style.display = 'block'; // Menampilkan surat
    document.getElementById('birthday-audio').play(); // Memutar lagu
    this.style.display = 'none'; // Sembunyikan tombol "Buka Surat"
});

document.getElementById('close-message-btn').addEventListener('click', function() {
    document.getElementById('birthday-message').style.display = 'none'; // Menyembunyikan surat
    document.getElementById('open-message-btn').style.display = 'block'; // Menampilkan kembali tombol "Buka Surat"
    document.getElementById('birthday-audio').pause(); // Menjeda lagu
    document.getElementById('birthday-audio').currentTime = 0; // Mengulang lagu dari awal
});