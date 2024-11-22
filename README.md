# Happy-Birthday-Ghea-
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Selamat Ulang Tahun!</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <div id="birthday-message-container">
        <button id="open-message-btn">Buka Surat Ucapan</button>
        <div id="birthday-message" class="hidden">
            <p>Selamat Ulang Tahun, [Nama]! 🎉</p>
            <p>Semoga hari ini penuh kebahagiaan dan cinta. Aku bersyukur bisa mengenalmu dan selalu ada untukmu. Semoga semua impianmu tercapai, dan tahun ini menjadi tahun terbaik untukmu!</p>
            <button id="close-message-btn">Tutup Surat</button>
        </div>
    </div>

    <audio id="birthday-audio" src="happy_birthday_song.mp3" preload="auto"></audio>

    <script src="script.js"></script>
</body> 
</html>
body {
    font-family: Arial, sans-serif;
    background-color: #f7f7f7;
    text-align: center;
    padding: 20px;
}

#birthday-message-container {
    margin-top: 50px;
}

#birthday-message {
    margin-top: 20px;
    background-color: #f9f9f9;
    border: 2px solid #eee;
    padding: 20px;
    border-radius: 10px;
    display: none;
    width: 80%;
    margin-left: auto;
    margin-right: auto;
}

button {
    padding: 10px 20px;
    background-color: #ffcc00;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}

button:hover {
    background-color: #ff9900;
}

.hidden {
    display: none;
}
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
