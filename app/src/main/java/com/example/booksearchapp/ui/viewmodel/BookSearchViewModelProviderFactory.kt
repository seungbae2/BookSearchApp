package com.example.booksearchapp.ui.viewmodel

//@Suppress("UNCHECKED_CAST")
//class BookSearchViewModelProviderFactory(
//    private val bookSearchRepository: BookSearchRepository,
//    private val workManager: WorkManager,
//    owner: SavedStateRegistryOwner,
//    defaultArgs: Bundle? = null,
//) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {
//    override fun <T : ViewModel> create(
//        key: String,
//        modelClass: Class<T>,
//        handle: SavedStateHandle
//    ): T {
//        if (modelClass.isAssignableFrom(BookSearchViewModel::class.java)) {
//            return BookSearchViewModel(bookSearchRepository, workManager, handle) as T
//        }
//        throw IllegalArgumentException("ViewModel class not found")
//    }
//}