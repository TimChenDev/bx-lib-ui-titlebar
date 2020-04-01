package co.bxvip.tools.toast

import android.app.Activity

inline fun Activity.toastMe(message: CharSequence) = ToastUtils.show(message)
inline fun Activity.toastMe(message: Int) = ToastUtils.show(message)
