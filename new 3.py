pip install SpeechRecognition
pip install pyaudio

import speech_recognition as sr

# Buat objek recognizer
recognizer = sr.Recognizer()

# Buka mikrofon
with sr.Microphone() as source:
    print("Silakan mulai berbicara...")
    recognizer.adjust_for_ambient_noise(source)  # Menyesuaikan kebisingan latar belakang
    audio = recognizer.listen(source)  # Mendengarkan audio dari mikrofon

try:
    # Menerjemahkan audio ke teks menggunakan recognizer
    text = recognizer.recognize_google(audio)
    print("Anda berkata: " + text)
except sr.UnknownValueError:
    print("Maaf, tidak bisa mengenali audio.")
except sr.RequestError as e:
    print("Terjadi kesalahan saat mengirim permintaan ke layanan Google: {0}".format(e))