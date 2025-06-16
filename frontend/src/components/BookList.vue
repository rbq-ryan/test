<template>
  <div>
    <h2>Books</h2>
    <ul>
      <li v-for="book in books" :key="book.id">{{ book.title }} - {{ book.author }}</li>
    </ul>
  </div>
</template>
<script>
import axios from 'axios';
export default {
  data() {
    return { books: [] };
  },
  mounted() {
    axios.get('/books').then(r => this.books = r.data);
  }
};
</script>
