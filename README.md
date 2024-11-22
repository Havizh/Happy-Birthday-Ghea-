<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Happy Birthday</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f5f5f5;
      text-align: center;
      padding-top: 20px;
    }
    #birthday-message {
      display: none;
      font-size: 20px;
      color: #2e8b57;
      margin-top: 20px;
      border: 2px solid #2e8b57;
      padding: 20px;
      background-color: #fff;
      border-radius: 10px;
      width: 60%;
      margin-left: auto;
      margin-right: auto;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    #open-message-btn {
      background-color: #4CAF50;
      color: white;
      padding: 10px 20px;
      font-size: 18px;
      cursor: pointer;
      border: none;
      border-radius: 5px;
    }
    #open-message-btn:hover {
      background-color: #45a049;
    }
    #birthday-audio {
      display: none; /* Hidden by default */
    }
  </style>
</head>
<body>

  <!-- Button to open birthday message -->
  <button id="open-message-btn">Klik untuk membuka ucapan!</button>

  <!-- Birthday message that will be revealed after 3 clicks -->
  <div id="birthday-message">
    <p>Gheoll, kurang 10 menit inii udaa tanggal 23 Novemberr!!!</p>
    <p>Happy Birthday Gheaaaa! Semoga di ultah kali ini kamu menjadi pribadi yang lebih baik!</p>
    <p>Selamat berkepala dua, hihihii!!!</p>
  </div>

  <!-- Audio for the birthday message -->
  <audio id="birthday-audio" src="whut.mp3"></audio>

  <script>
    // Initialize click count
    let clickCount = 0;

    document.addEventListener('DOMContentLoaded', function() {
      // Set up event listener for the "Buka Ucapan" button
      document.getElementById('open-message-btn').addEventListener('click', function() {
        clickCount++;

        if (clickCount === 3) {
          // Show the birthday message and play the audio after 3 clicks
          document.getElementById('birthday-message').style.display = 'block'; // Show the message
          document.getElementById('birthday-audio').play(); // Play the audio
          this.style.display = 'none'; // Hide the button after 3 clicks
        } else {
          // Update the button text to let the user know how many clicks left
          this.textContent = Klik lagi untuk membuka ucapan! (Klik ke-${clickCount + 1});
        }
      });
    });
  </script>

</body>
</html>
