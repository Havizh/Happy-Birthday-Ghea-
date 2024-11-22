# Happy-Birthday-Ghea-
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Happy Birthday Gheoll!</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <div id="birthday-message-container">
        <button id="open-message-btn">Buka Ucapan</button>
        <div id="birthday-message" class="hidden">
            <p>Gheoll, kurang 10 menit inii udaa tanggal 23 Novemberr!!!</p>
            <p>Karena aku ngga mauu diserobot sama yang lainn jadinya aku ngucapinnya sekarang ajaaa yaaa hehehehehe,</p>
            <p>Happy Birthday Gheaaa!!! 🎉</p>
            <p>Semoga di ultah yang kali inii kamu menjadii pribadi yang lebih baikk, selalu diberi kesehatan dan umur yang panjang serta rezeki yang melimpahh.</p>
            <p>Hehehe gara gara aku ngga mauu yang biasa biasa ajaa jadinya aku bikin kayak ginii wleeeee.</p>
            <p>Selamatt berkepala duaa, hihihii 😆</p>
            <button id="close-message-btn">Tutup Ucapan</button>
        </div>
    </div>

    <audio id="birthday-audio" src="whut_by_aisha_retno.mp3" preload="auto"></audio>

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
