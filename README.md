![S1](https://github.com/kchvbf/Android5/assets/109752188/07789d89-7a1d-4de2-9696-533cb7f37359)

![S2](https://github.com/kchvbf/Android5/assets/109752188/30bf0a0c-00b7-4e48-ad75-6f63077de719)

![S3](https://github.com/kchvbf/Android5/assets/109752188/ab61ca8a-7aad-48fb-b78e-78042b7de97b)

![S4](https://github.com/kchvbf/Android5/assets/109752188/9f393e90-2096-4661-bb1c-3c9fd5af4c57)

![S5](https://github.com/kchvbf/Android5/assets/109752188/bbc9af28-fa78-460d-aca0-e30fa7683207)

Запуск приложения:

2024-02-24 20:55:23.066  6674-6674  main activity log       com.example.businesscard             D  onCreate смс в логе

2024-02-24 20:55:23.070  6674-6674  main activity log       com.example.businesscard             D  onStart смс в логе

2024-02-24 20:55:23.073  6674-6674  main activity log       com.example.businesscard             D  onResume смс в логе

Когда мы запустили приложение вызываются три метода "создания"

onCreate() - подготавливает наше приложение к отображению, настраивает его размер, положение элементов и т.п.

onStart() - отображает приложение пользователю

onResume() - позволяет пользователю позволяет взаимодействовать с приложением кликать, скролить и т.п.

Поворот экрана:

2024-02-24 21:04:45.525  6674-6674  main activity log       com.example.businesscard             D  onPause смс в логе

2024-02-24 21:04:45.559  6674-6674  main activity log       com.example.businesscard             D  onStop смс в логе

2024-02-24 21:05:53.265  6674-6674  main activity log       com.example.businesscard             D  onDestroy смс в логе

2024-02-24 21:05:53.292  6674-6674  main activity log       com.example.businesscard             D  onCreate смс в логе

2024-02-24 21:05:53.294  6674-6674  main activity log       com.example.businesscard             D  onStart смс в логе

2024-02-24 21:05:53.295  6674-6674  main activity log       com.example.businesscard             D  onResume смс в логе

Вызываются методы "уничтожения" нашего приложения

onPause() - Запрещает пользователю взаимодействие с приложением

onStop() - Останавливает показ приложения пользователю

onDestroy() - уничтожает наше приложение

Дальше идет вызов методов создания, описанных в пред. пункте.

Свернуть приложение: 

2024-02-24 21:07:48.462  6674-6674  main activity log       com.example.businesscard             D  onPause смс в логе

2024-02-24 21:07:49.033  6674-6674  main activity log       com.example.businesscard             D  onStop смс в логе

Вызываются два метода "уничтожения"

onPause() - Запрещает пользователю взаимодействие с приложением

onStop() - Останавливает показ приложения пользователю

Развернуть приложение:

2024-02-24 21:08:28.657  6674-6674  main activity log       com.example.businesscard             D  onStart смс в логе

2024-02-24 21:08:28.658  6674-6674  main activity log       com.example.businesscard             D  onResume смс в логе

Вызывает два метода "создания" приложения

onStart() - отображает приложение пользователю

onResume() - позволяет пользователю позволяет взаимодействовать с приложением кликать, скролить и т.п.

Вызов функции finish():

2024-02-24 21:10:02.851  7627-7627  main activity log       com.example.businesscard             D  onCreate смс в логе

2024-02-24 21:10:03.422  7627-7627  main activity log       com.example.businesscard             D  onDestroy смс в логе

Наше приложение создается методом 

onCreate()

Приложение уничтожается вызовом метода finish()

Вызывается onDestroy()
